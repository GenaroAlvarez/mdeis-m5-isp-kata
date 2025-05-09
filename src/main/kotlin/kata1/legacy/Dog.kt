package kata1.legacy

class Dog: Animal {
    override fun fly() {
        throw NotImplementedError("Dog can't fly.")
    }

    override fun swim() {
        println("Dog is swimming!")
    }

    override fun run() {
        println("Dog is running!")
    }
}