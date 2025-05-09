package kata1.legacy

class Dog: Animal {
    override fun fly() {
        // Forced to implement
    }

    override fun swim() {
        println("Dog is swimming!")
    }

    override fun run() {
        println("Dog is running!")
    }
}