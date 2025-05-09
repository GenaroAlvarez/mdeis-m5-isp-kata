package kata5.refactored

import kata5.refactored.interfaces.MusicPlayable
import kata5.refactored.interfaces.PowerControllable
import kata5.refactored.interfaces.WiFiConnectable

class SmartSpeaker : PowerControllable, WiFiConnectable, MusicPlayable {
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