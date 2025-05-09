package kata3.refactored

import kata3.refactored.interfaces.Drivable

class Car : Drivable {
    override fun drive() {
        println("Car is driving!")
    }
}