package kata4.legacy

class HumiditySensor : Sensor {
    override fun readTemperature() {
        // Forced to implement
    }

    override fun readPressure() {
        // Forced to implement
    }

    override fun readHumidity() {
        println("Reading humidity!")
    }
}