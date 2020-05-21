import com.demo.model.FunctionsUtility

fun main(args: Array<String>) {
    println("Hello")
    val functionsUtility = FunctionsUtility()
    functionsUtility.display()

    println(functionsUtility.max(33, 34));

    // Calling with Default parameters
    functionsUtility.display("Olla", 0)
    functionsUtility.display("Olla")

    //Named Parameters
    functionsUtility.display(logLevel = 23, message = "Named Parameters")
}