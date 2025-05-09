package kata1

import kata1.legacy.Bird
import kata1.legacy.Dog
import kata1.legacy.Fish
import org.junit.jupiter.api.Test

class RefactoredKata1Test {
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
    fun fishSwimming() {
        val fish = Fish()
        fish.swim()
    }
}