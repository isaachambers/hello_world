/*
-> Can Add functions to classes not owned by you
-> Kotlin Generates static functions
-> Cuts down on use of utility classes
-> Makes code easier to read.'
-> Example extending the String class functionality.
 */
fun main(args: Array<String>) {
    //After defining the extended method. You can call it as if its from the same class.
    var text: String = "I                   WANT   ME"
    println(text.replaceMultipleSpace());
}

//Extended method structure
fun String.replaceMultipleSpace(): String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}