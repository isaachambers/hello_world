package com.demo.model

import java.net.URI

class FunctionsUtility {

    //  Creating a function with a return type
    fun connect(address: URI): Boolean {
        return false
    }

    fun display() {
        println("Display")
    }

    //Function Expressions
    fun max(a: Int, b: Int): Int = if (a > b) a else b

    //Default Parameters
    @JvmOverloads //Makes Kotlin generate extra methods because calling this method in Java will accept both parameter and ignore default parameters
    fun display(message: String, logLevel: Int = 1) {
        println("$message $logLevel")
    }
}