class PersonWithSecondaryConstructor (val firstName: String, val lastName: String) {
    init {
        println("Init 1")
    }

    constructor(): this("Peter", "Parker") {
        println("Secondary constructor")
    }

    init {
        println("Init 2")
    }
}