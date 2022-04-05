// -------------------- Variable --------------------
val constantName = "John Doe"
var mutableName = constantName
var nullableName: String? = null
var greeting: String? = null

fun printTopicHR(topic: String) = println("-------------------- $topic -------------------- ")

fun getGreeting1() = "Hello Kotlin"

fun voidFunctionWithExplicitReturnType(): Unit = println(getGreeting1())

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // -------------------- Variable --------------------
    printTopicHR("Variable")
    mutableName = "John Mutable"
    println("val: $constantName")
    println("var $mutableName")
    println("var $nullableName")

    // -------------------- Flow Control: "if assignment (ternary in JS)" --------------------
    printTopicHR("Flow Control: \"if assignment (ternary in JS)\"")
    var greetingToPrint = if(greeting != null) greeting else "Hi"
    println("if-assignment: $greetingToPrint $constantName")

    // -------------------- Flow Control: "when" --------------------
    printTopicHR("Flow Control: \"when\"")
    when (nullableName) {
        null -> println("when: John Doe")
        else -> println("when: $nullableName")
    }
    // Assignment
    greetingToPrint = when (greeting) {
        null -> "hi"
        else -> greeting
    }
    println("when-assignment: $greetingToPrint $constantName")

    // -------------------- Function --------------------
    printTopicHR("Function")
    println(getGreeting1())
    voidFunctionWithExplicitReturnType()
}