package kata4.refactored

import kata4.refactored.interfaces.HumidityReadable

class HumiditySensor : HumidityReadable {
    override fun readHumidity() {
        println("Reading humidity!")
    }
}