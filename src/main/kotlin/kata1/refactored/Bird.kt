package kata1.refactored

class Bird : Flyable, Runnable {
    override fun fly() {
        println("Bird is flying!")
    }

    override fun run() {
        println("Bird is running!")
    }
}