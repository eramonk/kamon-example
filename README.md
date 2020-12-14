# akka-quickstart-scala

Enter `./sbt` on OSX/Linux or `sbt.bat` on Windows to start sbt.

sbt downloads project dependencies. The > prompt indicates sbt has started in interactive mode.

At the sbt prompt, enter `reStart`.

sbt builds the project and runs Hello World.

The output should look something like this (scroll all the way to the right to see the Actor output):
```
[INFO] [09/13/2018 20:54:36.604] [helloAkka-akka.actor.default-dispatcher-3] [akka://helloAkka/user/printerActor] Greeting received (from Actor[akka://helloAkka/user/goodDayGreeter#1797090524]): Good day, Play
[INFO] [09/13/2018 20:54:36.605] [helloAkka-akka.actor.default-dispatcher-3] [akka://helloAkka/user/printerActor] Greeting received (from Actor[akka://helloAkka/user/howdyGreeter#-1409063402]): Howdy, Akka
[INFO] [09/13/2018 20:54:36.605] [helloAkka-akka.actor.default-dispatcher-3] [akka://helloAkka/user/printerActor] Greeting received (from Actor[akka://helloAkka/user/helloGreeter#-1542132946]): Hello, Scala
[INFO] [09/13/2018 20:54:36.606] [helloAkka-akka.actor.default-dispatcher-3] [akka://helloAkka/user/printerActor] Greeting received (from Actor[akka://helloAkka/user/howdyGreeter#-1409063402]): Howdy, Lightbend
[INFO] [09/13/2018 20:54:36.606] [helloAkka-akka.actor.default-dispatcher-3] [akka://helloAkka/user/printerActor] Greeting received (from Actor[akka://helloAkka/user/moinsenGreeter#-1188418000]): Moinsen, Digga
```
