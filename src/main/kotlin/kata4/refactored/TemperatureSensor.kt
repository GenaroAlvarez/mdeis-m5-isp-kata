package kata4.refactored

import kata4.refactored.interfaces.TemperatureReadable

class TemperatureSensor : TemperatureReadable {
    override fun readTemperature() {
        println("Reading temperature!")
    }
}