package kata4

import kata4.refactored.HumiditySensor
import kata4.refactored.PressureSensor
import kata4.refactored.TemperatureSensor
import org.junit.jupiter.api.Test

class RefactoredKata4Test {
    @Test
    fun temperatureSensorReadingTemperature() {
        val temperatureSensor = TemperatureSensor()
        temperatureSensor.readTemperature()
    }

    @Test
    fun pressureSensorReadingPressure() {
        val pressureSensor = PressureSensor()
        pressureSensor.readPressure()
    }

    @Test
    fun humiditySensorReadingHumidity() {
        val humiditySensor = HumiditySensor()
        humiditySensor.readHumidity()
    }
}