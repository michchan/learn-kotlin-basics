fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet -> println("$greeting $itemToGreet") }
}

fun greetPerson(greeting: String, name: String) = println("$greeting $name")

fun printList(list: List<String>) {
    println(list.size)
    println(list[0])
    println(list.get(0))

    for (item in list) {
        println(item)
    }

    list.forEach { println(it) }
    list.forEach { item -> println(item) }
    list.forEachIndexed { index, item ->
        println("$item is at $index")
    }
}

fun main() {
    val myTechStack = arrayOf("JavaScript", "TypeScript", "React")
    val interestingThings = listOf("Football", "Premier League", "Arsenal")
    printList(myTechStack.asList())
    printList(interestingThings)

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) -> println("$key -> $value") }

    val interestingThingsMutable = mutableListOf("Football", "Premier League", "Arsenal")
    interestingThingsMutable.add("Arsene Wenger")

    val mapMutable = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mapMutable.put(4, "d")
    mapMutable[5] = "e"

    sayHello("Hi", "React", "React Native", "TypeScript")
    // Spread operator
    sayHello("Hi", *myTechStack)
    sayHello("Hi", *interestingThings.toTypedArray())

    // Named Arguments (order doesn't matter now)
    greetPerson(name = "John Doe", greeting = "Hi")
    sayHello(greeting = "Hi", itemsToGreet = *interestingThings.toTypedArray())
}