package example

import org.apache.logging.log4j.scala.Logging
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.core.config.Configurator

object Hello extends App with Logging {
  override def main(args: Array[String]): Unit = {
    System.getenv("LOGGER_LEVEL") match {
      case "DEBUG" => Configurator.setRootLevel(Level.DEBUG)
      case "INFO"  => Configurator.setRootLevel(Level.INFO)
      case "WARN"  => Configurator.setRootLevel(Level.WARN)
      case "ERROR" => Configurator.setRootLevel(Level.ERROR)
      case "FATAL" => Configurator.setRootLevel(Level.FATAL)
      case "TRACE" => Configurator.setRootLevel(Level.TRACE)
      case _       => Configurator.setRootLevel(Level.INFO)
    }
    println("Hello, world!")
    logger.info("Hello")
    logger.warn("Hello")
    logger.error("Hello")
    logger.debug("Hello")
    logger.fatal("Hello")
    logger.trace("Hello")
  }
}
