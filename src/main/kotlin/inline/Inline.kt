package inline

fun main() {
    println((AnimalFactory().createAnimal<Dog>()).makeSound())
}

class AnimalFactory {
    inline fun <reified T : Animal> createAnimal(): T {
        return when (T::class) {
            Cat::class -> Cat
            Dog::class -> Dog
            Eagle::class-> Eagle
            else -> throw IllegalArgumentException("Unknown animal type")
        } as T
    }
}

@JvmInline
value class SomeId(
    val value: String
)