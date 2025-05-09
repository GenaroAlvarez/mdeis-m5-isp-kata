package kata5.legacy

class SmartSpeaker : SmartDevice {
    override fun turnOn() {
        println("Smart speaker turning on!")
    }

    override fun turnOff() {
        println("Smart speaker turning off!")
    }

    override fun connectToWifi() {
        println("Smart speaker connecting to Wifi!")
    }

    override fun playMusic() {
        println("Smart speaker playing music!")
    }
}