package com.kotlin.action

/**
 * As the example for this section, you’ll write a function that evaluates simple arithmetic
expressions like (1 + 2) + 4. The expressions will contain only one type of operation: the
sum of two numbers. Other arithmetic operations (subtraction, multiplication, division)
can be implemented in a similar way, and you can do that as an exercise.
First, how do you encode the expressions? You store them in a tree-like structure,
where each node is either a sum ( Sum ) or a number ( Num ). Num is always a leaf node,
whereas a Sum node has two children: the arguments of the sum operation. The following
snippet shows a simple structure of classes used to encode the expressions: an interface
called Expr and two classes, Num and Sum , that implement it. Note that the Expr interface
doesn’t declare any methods; it’s used as a marker interface to provide a common type
for different kinds of expressions. To mark that a class implements an interface, you use
a colon ( : ) followed by the interface name:
 */

interface Expression

class Num(val value: Int) : Expression
class Sum(val left: Expression, val right: Expression) : Expression

// More complex
fun evalLikeJava(e: Expression): Int {
    // Compiler do casting verification for this expression; We will call it as 'SmartCast'
    if (e is Num) {
        return e.value
    }
    if (e is Sum) {
        return evalLikeJava(e.left) + evalLikeJava(e.right)
    }
    throw IllegalArgumentException("Unknown Expression")
}

// Simplified version using Kotlin smarcast with if expression
fun evalLikeKotlin(e: Expression): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            evalLikeKotlin(e.left) + evalLikeKotlin(e.right)
        } else {
            throw IllegalArgumentException("Unknown Expression")
        }

// More simplified version using Kotlin smartcast with when expression
fun evalUsingWhen(e: Expression): Int =
        when (e) {
            is Num -> e.value
            is Sum -> evalUsingWhen(e.left) + evalUsingWhen(e.right)
            else -> throw IllegalArgumentException("Unknown Expression")
        }
// Blocks as branches of 'if' and 'when'; The last line of the expression is result
fun evalWithLogging(e: Expression): Int =
        when (e) {
            is Num -> {
                println("Num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("Sum of $left + $right is ")
                left + right
            }
            else -> throw IllegalArgumentException("Unknown Expression")
        }

fun main(args: Array<String>) {
    println(evalLikeJava(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalLikeKotlin(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalUsingWhen(Sum(Sum(Num(1), Num(2)), Num(4))))

}