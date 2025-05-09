package kata3.legacy

import java.lang.UnsupportedOperationException

class Car : Vehicle {
    override fun drive() {
        println("Car is driving!")
    }

    override fun fly() {
        throw UnsupportedOperationException("Car can't fly")
    }

    override fun sail() {
        throw UnsupportedOperationException("Car can't sail")
    }
}