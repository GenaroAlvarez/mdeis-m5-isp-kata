package kata5

import kata5.legacy.SmartLight
import kata5.legacy.SmartSpeaker
import org.junit.jupiter.api.Test

class LegacyKata5Test {
    @Test
    fun smartLight() {
        val smartLight = SmartLight()
        smartLight.turnOn()
        smartLight.connectToWifi()
        smartLight.playMusic()
        smartLight.turnOff()
    }

    @Test
    fun smartSpeaker() {
        val smartSpeaker = SmartSpeaker()
        smartSpeaker.turnOn()
        smartSpeaker.connectToWifi()
        smartSpeaker.playMusic()
        smartSpeaker.turnOff()
    }
}