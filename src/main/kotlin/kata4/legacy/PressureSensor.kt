package kata4.legacy

class PressureSensor : Sensor {
    override fun readTemperature() {
        // Forced to implement
    }

    override fun readPressure() {
        println("Reading pressure!")
    }

    override fun readHumidity() {
        // Forced to implement
    }
}