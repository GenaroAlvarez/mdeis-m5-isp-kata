package kata5

import kata5.refactored.SmartLight
import kata5.refactored.SmartSpeaker
import org.junit.jupiter.api.Test

class RefactoredKata5Test {
    @Test
    fun smartLight() {
        val smartLight = SmartLight()
        smartLight.turnOn()
        smartLight.connectToWifi()
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