package kata1.refactored

import kata1.refactored.interfaces.Swimmable

class Fish : Swimmable {
    override fun swim() {
        println("Fish is swimming!")
    }
}