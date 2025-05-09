package kata5.refactored

import kata5.refactored.interfaces.PowerControllable
import kata5.refactored.interfaces.WiFiConnectable

class SmartLight : PowerControllable, WiFiConnectable {
    override fun turnOn() {
        println("Smart light turning on!")
    }

    override fun turnOff() {
        println("Smart light turning off!")
    }

    override fun connectToWifi() {
        println("Smart light connecting to Wifi!")
    }
}