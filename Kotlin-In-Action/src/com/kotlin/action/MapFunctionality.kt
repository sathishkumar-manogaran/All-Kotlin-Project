package com.kotlin.action

import java.util.*

val binaryRangeMap = TreeMap<Char, String>()

fun binaryRange() {
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        // Its equivalent in Java; binaryReps.put(c, binary)
        // get() and put() from Java are omitted
        binaryRangeMap[c] = binary
    }
}

fun getMap() {

    // Calling above function
    binaryRange()

    // Iterate over the map using Key and Value pair;
    // Instead of Iterate key alone we can iterate key and value pair
    // This is called unpacking syntex
    for ((letterKey, binaryValue) in binaryRangeMap) {
        println("$letterKey : $binaryValue")
    }
}

// Make this unpacking syntax more powerful
fun unPackingSyntax() {
    val list = arrayListOf("1", "2", "3", "10", "11")
    for ((index, element) in list.withIndex()) {
        println("$index : $element")
    }
}

// More action using 'in' range or collection

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    getMap()
    unPackingSyntax()
    println(isLetter('z'))
    println(isNotDigit('1'))

}