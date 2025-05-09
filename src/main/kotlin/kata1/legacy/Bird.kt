package kata1.legacy

class Bird : Animal {
    override fun fly() {
        println("Bird is flying!")
    }

    override fun swim() {
        // Forced to implement
    }

    override fun run() {
        println("Bird is running!")
    }
}