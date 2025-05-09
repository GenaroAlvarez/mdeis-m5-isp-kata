package kata1.refactored

import kata1.refactored.interfaces.Runnable
import kata1.refactored.interfaces.Swimmable

class Dog : Runnable, Swimmable {
    override fun run() {
        println("Dog is running!")
    }

    override fun swim() {
        println("Dog is swimming!")
    }
}