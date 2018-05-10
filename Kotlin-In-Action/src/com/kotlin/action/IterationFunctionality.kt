package com.kotlin.action

val oneToHundred: IntRange = 1..100 // Number Range; Most useful for iteration; This is called progression

// Small function to play FizzBuzz game; divisable by 3, 5 and 3 * 5
fun fizzBuzz(i: Int) =
        when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> "$i"
        }

fun main(args: Array<String>) {
    for (i in oneToHundred step 2) {
        println(fizzBuzz(i))
    }

    // Changed Number Range from 100 to 1 and include only even numbers; step allows to skip some numbers
    // Step is nothing but its kind of increment as in Java (value + 2)
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }

    unPackingSyntax()
}