package kata3

import kata3.refactored.Boat
import kata3.refactored.Car
import kata3.refactored.Plane
import org.junit.jupiter.api.Test

class RefactoredKata3Test {

    @Test
    fun driveCar() {
        val car = Car()
        car.drive()
    }

    @Test
    fun flyPlane() {
        val plane = Plane()
        plane.fly()
    }

    @Test
    fun sailBoat() {
        val boat = Boat()
        boat.sail()
    }
}