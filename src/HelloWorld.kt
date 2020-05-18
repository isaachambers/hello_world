import com.demo.model.Person
import java.util.*

fun main(args: Array<String>) {
    println("hello world")
    val jane = Person("Jane", "Milly")
    println(jane.firstName)
    jane.saySecondName()
    jane.sayWithLambda(::printFirstName)


    //Immutability - Make a value immutable by declaring it as var instead of val
    //String interpolation
    var description = "My full names are ${jane.firstName} ${jane.secondName}"
    println(description)

    //you can compare strings easily with == operator.
    val question = Question()
    var message: String
    if (question.answer == "23") {
        message = "Correct Answer"
    } else {
        message = "Incorrect Answer"
    }
    println(message);

    //Use if statement as an expression.
    var wrongAnswer: String = if (question.answer == "40") {
        "Correct"
    } else {
        "Wrong"
    }
    println(wrongAnswer);

    //Kotlin has no switch statement so When Is used.

    when (question.answer) {
        "34" -> println("Hell No")
        "23" -> println("Hell Yeah")
        else -> Unit
    }

    // Try Catch Block is an expression as well

    val number: Int = try {
        Integer.parseInt(question.answer)
    } catch (ex: NumberFormatException) {
        ex.printStackTrace()
        -1
    }
    println(number + 1);

    // You can make number nullable thei the ? operator
    val number1: Int? = try {
        Integer.parseInt(question.answer)
    } catch (ex: NumberFormatException) {
        null
    }
    println(number1)


//     Looping * For loops
//    Creating a range of values,
    for (i in 1..10) {
        println(i + number)
    }

    println("_")
    for (i in 1..10 step 3) {
        println(i + number)
    }

    for (i in 1 until 23) {
        println(i + number)
    }

    var numbers = listOf<Int>(1, 2, 3, 4, 5)
    for (i in numbers) {
        println(i)
    }

    for ((index, element) in numbers.withIndex()) {
        println("$index contains $element")
    }

    var data = TreeMap<String, Int>();
    data["Jame"] = 23
    data["Mark"] = 55

    for ((name, age) in data) {
        println("$name $age")
    }

}

fun printFirstName(name: String) {
    println(name);
}

//Inner classes
class Question {
    val question: String = "Which is it?"
    var answer: String = "23";
}