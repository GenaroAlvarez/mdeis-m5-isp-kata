package kata3

import kata3.refactored.Boat
import kata3.refactored.Car
import kata3.refactored.Plane
import org.junit.jupiter.api.Test

class RefactoredKata3Test {

    @Test
    fun carDriving() {
        val car = Car()
        car.drive()
    }

    @Test
    fun planeFlying() {
        val plane = Plane()
        plane.fly()
    }

    @Test
    fun boatSailing() {
        val boat = Boat()
        boat.sail()
    }
}