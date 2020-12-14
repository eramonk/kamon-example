package com.lightbend.akka.sample

import akka.actor.{ActorRef, ActorSystem}
import com.lightbend.akka.sample.db.DbSupport

import scala.util.Random
import kamon.Kamon


object Main extends App {

  import Greeter._

  Kamon.init()

  val system: ActorSystem = ActorSystem("helloAkka")

  val printer: ActorRef = system.actorOf(Printer.props, "printerActor")
  
  val db = DbSupport.getConnection
  println(db.getClientInfo())
  println(db.getSchema())

  val howdyGreeter: ActorRef = system.actorOf(Greeter.props("Howdy", printer), "howdyGreeter")
  val helloGreeter: ActorRef = system.actorOf(Greeter.props("Hello", printer), "helloGreeter")
  val goodDayGreeter: ActorRef = system.actorOf(Greeter.props("Good day", printer), "goodDayGreeter")
  val moinsenGreeter: ActorRef = system.actorOf(Greeter.props("Moinsen", printer), "moinsenGreeter")

  howdyGreeter ! WhoToGreet("Akka")
  howdyGreeter ! Greet

  howdyGreeter ! WhoToGreet("Lightbend")
  howdyGreeter ! Greet

  helloGreeter ! WhoToGreet("Scala")
  helloGreeter ! Greet

  goodDayGreeter ! WhoToGreet("Play")
  goodDayGreeter ! Greet

  moinsenGreeter ! WhoToGreet("Digga")
  moinsenGreeter ! Greet

  val allGreeters = Vector(howdyGreeter, helloGreeter, goodDayGreeter)
  def randomGreeter = allGreeters(Random.nextInt(allGreeters.length))

  while(true) {
    randomGreeter ! Greet
    Thread.sleep(100)
  }
}
