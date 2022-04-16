interface PersonInfoProviderWithoutDefaultLogic {
    fun printInfo(person: Person)
}

interface PersonInfoProvider {
    val providerInfo: String

    // Default implementation, to encapsulate this logic into the interface itself
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

// abstract class BasicInfoProvider: PersonInfoProvider

class BasicInfoProviderWithoutDefaultLogic: PersonInfoProviderWithoutDefaultLogic {
    override fun printInfo(person: Person) {
        println("BasicInfoProvider")
        person.printInfo()
    }
}

class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun getSessionId(): String {
        return "Session 132"
    }
}

fun main() {
    val provider = BasicInfoProvider()
    val person = Person()
    provider.printInfo(person)
    println(provider.getSessionId())

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("NOT session info")
        return
    }
    println("is session info")
    // Type Casting (explicit)
    (infoProvider as SessionInfoProvider).getSessionId()
    // Smart Cast
    infoProvider.getSessionId()
}