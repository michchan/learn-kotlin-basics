// Default constructor argument values
class Person (val firstName: String = "Peter", val lastName: String = "Parker") {
    var nickName: String? = null
        // Override default setter/getter
        set(value) {
            field = value
            println("nickName is set as $value")
        }
        get() {
            println("nickName is get as $field")
            return field
        }

    fun printInfo() {
        // Elvis operator - equivalent to the following
        // val nickNameToPrint = if(nickName != null) nickName else "No nickname"
        val nickNameToPrint = nickName ?: "No nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}