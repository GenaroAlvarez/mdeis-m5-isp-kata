package kata3.refactored

import kata3.refactored.interfaces.Flyable

class Plane : Flyable {
    override fun fly() {
        println("Plane is flying!")
    }
}