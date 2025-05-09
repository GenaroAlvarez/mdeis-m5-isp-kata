package kata1.legacy

class Bird : Animal {
    override fun fly() {
        println("Bird is flying!")
    }

    override fun swim() {
        throw NotImplementedError("Bird can't swim.")
    }

    override fun run() {
        println("Bird is running!")
    }
}