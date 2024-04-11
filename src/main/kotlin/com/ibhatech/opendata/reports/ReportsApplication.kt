package com.ibhatech.opendata.reports

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import java.io.File

@SpringBootApplication
class ReportsApplication

val log = LoggerFactory.getLogger(ReportsApplication::class.java)



fun main(args: Array<String>) {
	runApplication<ReportsApplication>(*args)
	log.info("starting the App----------")
	val f = File(".")
	log.info("app absolutePath = {} ",f.absolutePath)
	log.info("app absoluteFile = {} ",f.absoluteFile)
	log.info("app canonicalFile = {} ",f.canonicalFile)
	log.info("app canonicalPath = {} ",f.canonicalPath)

	log.info("-----App is started ---------------")

}