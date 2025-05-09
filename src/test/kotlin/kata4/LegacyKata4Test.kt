package kata4

import kata4.legacy.HumiditySensor
import kata4.legacy.PressureSensor
import kata4.legacy.TemperatureSensor
import org.junit.jupiter.api.Test

class LegacyKata4Test {
    @Test
    fun temperatureSensorReadingTemperature() {
        val temperatureSensor = TemperatureSensor()
        temperatureSensor.readTemperature()
    }

    @Test
    fun temperatureSensorReadingPressure() {
        val temperatureSensor = TemperatureSensor()
        temperatureSensor.readPressure()
    }

    @Test
    fun temperatureSensorReadingHumidity() {
        val temperatureSensor = TemperatureSensor()
        temperatureSensor.readHumidity()
    }

    @Test
    fun pressureSensorReadingTemperature() {
        val pressureSensor = PressureSensor()
        pressureSensor.readTemperature()
    }

    @Test
    fun pressureSensorReadingPressure() {
        val pressureSensor = PressureSensor()
        pressureSensor.readPressure()
    }

    @Test
    fun pressureSensorReadingHumidity() {
        val pressureSensor = PressureSensor()
        pressureSensor.readHumidity()
    }

    @Test
    fun humiditySensorReadingTemperature() {
        val humiditySensor = HumiditySensor()
        humiditySensor.readTemperature()
    }

    @Test
    fun humiditySensorReadingPressure() {
        val humiditySensor = HumiditySensor()
        humiditySensor.readPressure()
    }

    @Test
    fun humiditySensorReadingHumidity() {
        val humiditySensor = HumiditySensor()
        humiditySensor.readHumidity()
    }
}