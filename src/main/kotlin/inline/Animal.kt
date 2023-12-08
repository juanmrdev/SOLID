package inline

sealed class Animal {
    abstract fun makeSound()
}

object Cat : Animal() {
    override fun makeSound() {
        println("Meow!")
    }
}

object Dog : Animal() {
    override fun makeSound() {
        println("Woof!")
    }
}

object Eagle : Animal() {
    override fun makeSound() {
        println("Screech!")
    }
}