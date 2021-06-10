package com.nabenik.tdc

import picocli.CommandLine
import java.io.File
import java.nio.file.Files
import java.util.concurrent.Callable
import kotlin.system.exitProcess

/**
 * Hello world!
 *
 */
@CommandLine.Command(name = "App", mixinStandardHelpOptions = true, version = ["app 0.0"],
    description = ["Prints a list of hello phrases from a given file"])
class App: Callable<Int> {

    @CommandLine.Parameters(index = "0", description = ["File to iterate over greetings"])
    lateinit var file: File

    override fun call(): Int {
        val fileContents = Files.readAllLines(file.toPath())
        fileContents.forEach { println(it) }
        return 0
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) : Unit = exitProcess(CommandLine(App()).execute(*args))
    }

}
