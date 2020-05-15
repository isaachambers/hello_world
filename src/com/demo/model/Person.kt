package com.demo.model

class Person(var firstName: String, var secondName: String) {

    fun saySecondName() {
        println("My Second Name is $secondName")
    }

    fun sayWithLambda(func: (value: String) -> Unit) {
        func(firstName);
    }
}