package com.kotlin.action

// Remove this import and add property explicitily
import com.kotlin.action.Color.*

enum class Color(val r: Int, val g: Int, val b: Int) {

    // if you define any methods in the enum class, the semicolon separates the enum constant list from the method definitions
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    ORANGE(100, 200, 50),
    YELLOW(50, 60, 70);

    // Create function inside enum class
    fun rgb() = (r * 256 + g) * 256 + b
}

/**
 * 'when' is expression in Kotlin; its replacement of Switch statement in Java
 */
fun getMnemonic(color: Color) =
        when (color) {
            RED -> "Richard"
            GREEN -> "Green"
            BLUE -> "Blue"
            YELLOW -> "Yello"
            ORANGE -> "Orange"
        }