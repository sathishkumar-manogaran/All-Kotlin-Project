package com.kotlin.action

// import statement simple
import com.kotlin.action.Color.*

class Person(var fullName: String, var isMarried: Boolean)

class Rectangle(var height: Int, var width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val person = Person("Satz", true)
    println("Person Marital Status ${person.isMarried}")
    person.fullName = "Sathishkumar Manogaran"
    person.isMarried = false
    println("Person Marital Status ${person.isMarried}")

    val rectangle = Rectangle(10, 11)
    println("Given value is square ${rectangle.isSquare}")
    rectangle.height = 10
    rectangle.width = 10
    println("Given value is square ${rectangle.isSquare}")

    println(GREEN.rgb())
    println(RED.r)

    println(getMnemonic(BLUE))

    fun getWarmth(color: Color) =
            when (color) {
                RED, BLUE -> "Red or Blue"
                GREEN -> "Green"
                else -> "No color"
            }
    println(getWarmth(BLUE))

    /**
     * Using 'when' with arbitrary objects
     */
    fun mix(c1: Color, c2: Color) =
            when (setOf(c1, c2)) {
            // A set is a collection for which the order of items does not matter
                setOf(RED, BLUE) -> "Red and Blue"
                setOf(GREEN, YELLOW) -> "Green and Yellow"
            // Two sets are equal if they contain the same items
                setOf(ORANGE, RED) -> "Orange and Red"
            //else -> throw Exception("No set of colors")
                else -> "No Match of colors"
            }

    println(mix(RED, BLUE))
    println(mix(RED, GREEN))

    /**
     * Using 'when' without an argument
     */
    fun mixOptimized(c1: Color, c2: Color) =
            when {
                // Its harder to read comparing with above mix()
                (c1 == RED && c2 == ORANGE) || (c1 == GREEN && c2 == BLUE) -> YELLOW
                (c1 == YELLOW && c2 == BLUE) ||
                        (c1 == BLUE && c2 == YELLOW) ->
                    GREEN
                else -> throw Exception("No Matching color found")
            }

    println(mixOptimized(YELLOW, Color.BLUE))
}