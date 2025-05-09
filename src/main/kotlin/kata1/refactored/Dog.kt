package kata1.refactored

class Dog : Runnable, Swimmable {
    override fun run() {
        println("Dog is running!")
    }

    override fun swim() {
        println("Dog is swimming!")
    }
}