package com.lightbend.akka.sample.db

import java.sql.Connection

import com.zaxxer.hikari.{HikariConfig, HikariDataSource}

object DbSupport  {

  // Initialize JDBC and ORM
  val ds: HikariDataSource = configureHikariDataSource

  def getConnection: Connection = ds.getConnection

  private def configureHikariDataSource: HikariDataSource = synchronized {

        Class.forName("org.postgresql.Driver")

    val connectionPool = {
      val config = new HikariConfig()
            config.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres?currentSchema=public")
            config.setUsername("postgres")
            config.setPassword("postgres")
            config.setMaximumPoolSize(2)
            config.setLeakDetectionThreshold(1000)
            config.setAutoCommit(true)
      new HikariDataSource(config)
    }

    connectionPool
  }

  //  configureHikariDataSource.getConnection

}
