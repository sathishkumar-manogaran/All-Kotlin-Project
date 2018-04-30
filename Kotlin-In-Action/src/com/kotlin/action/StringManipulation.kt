package com.kotlin.action

//class StringManipulation {
fun main(args: Array<String>) {
//    val name = if (args.size > 0) args[0] else "Kotlin"
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"     // improved version of checking empty in kotlin

    println("Hello, $name")
    println("Hello, $name")
    println("\$name")           // To print $ sign in the result; use escape character "\$name"
    val testArray = arrayListOf("Satz", "satz")
    println("Hello for whole array, ${testArray[0]}, ${testArray[1]}!")      // Using $ for complex expression
    println("Hello for 'if' expression body, ${if(testArray.isNotEmpty()) testArray[0] else "No Value"}")
}
//}