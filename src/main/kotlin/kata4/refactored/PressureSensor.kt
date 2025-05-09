package kata4.refactored

import kata4.refactored.interfaces.PressureReadable

class PressureSensor : PressureReadable {
    override fun readPressure() {
        println("Reading pressure!")
    }
}