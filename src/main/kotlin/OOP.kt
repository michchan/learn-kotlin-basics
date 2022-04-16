fun main() {
    val emptyPerson = EmptyPerson()
    println(emptyPerson.toString())

    val person2 = PersonWithSecondaryConstructor()
    println(person2.firstName)
    println(person2.lastName)

    val person3 = Person()
    person3.nickName = "NICK"
    person3.nickName = "Shades"
    println(person3.nickName)

    val person4 = Person()
    person4.printInfo()
}