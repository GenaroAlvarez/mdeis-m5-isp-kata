package kata1.refactored

import kata1.refactored.interfaces.Flyable
import kata1.refactored.interfaces.Runnable

class Bird : Flyable, Runnable {
    override fun fly() {
        println("Bird is flying!")
    }

    override fun run() {
        println("Bird is running!")
    }
}