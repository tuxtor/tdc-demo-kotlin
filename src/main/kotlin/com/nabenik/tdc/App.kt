package com.nabenik.tdc

import kotlin.jvm.JvmStatic

/**
 * Hello world!
 *
 */
object App {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello ${args.getOrNull(0)?:"World"}")
    }
}
