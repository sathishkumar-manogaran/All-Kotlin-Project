package com.kotlin.action

data class PersonTest(val name: String, val age: Int? = 50)

/*fun main(args: Array<String>) {
    val persons = listOf(Person("Test"), Person("Satz", age = 25))

    val oldest = persons.maxBy { it.age ?: 0 }

    println("The Oldest $oldest")
}*/

private fun getQuestion() = "Test Question, created by me!!"
const val answer: Int = 12

val doubleValue = 7.5 * 106

val answerValue: Int = 42




fun main(args: Array<String>) {
    println("Test")
    println(max(1, 2))
    println(maxRemoveReturn(1, 2))
    print(maxMoreSimple(2, 10))
    getQuestion()
    answer
    println(doubleValue)
    checkCondition()
    println(message)
}



fun max(a: Int, b: Int): Int {
    return if (a > b) a else b      // It’s similar to a ternary operator in Java: (a > b) ? a : b
}




/**
 * Its body consists of just a
single expression, you can use that expression as the entire body of the function,
removing the curly braces and the return statement:
 */
fun maxRemoveReturn(a: Int, b: Int): Int = if (a > b) a else b




/**
You can simplify the max function even more and omit the return type:
 */
fun maxMoreSimple(a: Int, b: Int) = if (a > b) a else b



/**
 * Building block for Immutable var changes
 */
var message: String = ""
fun checkCondition() {
    if (true) {
        message = "Success"
    } else {
        message = "Failed"
    }
}


val lang = arrayListOf("Java")
//lang.add("Kotlin")