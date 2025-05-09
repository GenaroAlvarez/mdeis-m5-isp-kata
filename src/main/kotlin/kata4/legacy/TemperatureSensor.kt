package kata4.legacy

class TemperatureSensor : Sensor {
    override fun readTemperature() {
        println("Reading temperature!")
    }

    override fun readPressure() {
        // Forced to implement
    }

    override fun readHumidity() {
        // Forced to implement
    }
}