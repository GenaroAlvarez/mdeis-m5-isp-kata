package kata5.legacy

class SmartLight : SmartDevice {
    override fun turnOn() {
        println("Smart light turning on!")
    }

    override fun turnOff() {
        println("Smart light turning off!")
    }

    override fun connectToWifi() {
        println("Smart light connecting to Wifi!")
    }

    override fun playMusic() {
        // Forced to implement
    }
}