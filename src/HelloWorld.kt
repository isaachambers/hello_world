import com.demo.model.Person

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

}

fun printFirstName(name: String) {
    println(name);
}

//Inner classes
class Question {
    val question: String = "Which is it?"
    var answer: String = "23";
}