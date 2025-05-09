package kata1

import kata1.legacy.Bird
import kata1.legacy.Dog
import kata1.legacy.Fish
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import kotlin.test.assertContains

class LegacyKata1Test {

    @Test
    fun birdFlying() {
        val bird = Bird()
        bird.fly()
    }

    @Test
    fun birdRunning() {
        val bird = Bird()
        bird.run()
    }

    @Test
    fun birdSwimming() {
        val bird = Bird()
        val swimException = assertThrows(NotImplementedError::class.java) {
            bird.swim()
        }
        assertContains(swimException.message!!, "can't swim.");
    }

    @Test
    fun dogRunning() {
        val dog = Dog()
        dog.run()
    }

    @Test
    fun dogSwimming() {
        val dog = Dog()
        dog.swim()
    }

    @Test
    fun dogFlying() {
        val dog = Dog()
        val flyException = assertThrows(NotImplementedError::class.java) {
            dog.fly()
        }
        assertContains(flyException.message!!, "can't fly.")
    }

    @Test
    fun fishSwimming() {
        val fish = Fish()
        fish.swim()
    }

    @Test
    fun fishRunning(){
        val fish = Fish()
        val runException = assertThrows(NotImplementedError::class.java) {
            fish.run()
        }
        assertContains(runException.message!!, "can't run.")
    }

    @Test
    fun fishFlying(){
        val fish = Fish()
        val flyException = assertThrows(NotImplementedError::class.java) {
            fish.fly()
        }
        assertContains(flyException.message!!, "can't fly.")
    }
}