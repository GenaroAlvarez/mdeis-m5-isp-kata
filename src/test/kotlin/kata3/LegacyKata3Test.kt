package kata3

import kata3.legacy.Boat
import kata3.legacy.Car
import kata3.legacy.Plane
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.UnsupportedOperationException
import kotlin.test.assertContains

class LegacyKata3Test {

    @Test
    fun flyCar() {
        val car = Car()
        val exception = Assertions.assertThrows(UnsupportedOperationException::class.java) {
            car.fly()
        }
        assertContains(exception.message!!, "can't fly")
    }

    @Test
    fun driveCar() {
        val car = Car()
        car.drive()
    }

    @Test
    fun sailCar() {
        val car = Car()
        val exception = Assertions.assertThrows(UnsupportedOperationException::class.java) {
            car.sail()
        }
        assertContains(exception.message!!, "can't sail")
    }

    @Test
    fun flyPlane() {
        val plane = Plane()
        plane.fly()
    }

    @Test
    fun drivePlane() {
        val plane = Plane()
        val exception = Assertions.assertThrows(UnsupportedOperationException::class.java) {
            plane.drive()
        }
        assertContains(exception.message!!, "can't drive")
    }

    @Test
    fun sailPlane() {
        val plane = Plane()
        val exception = Assertions.assertThrows(UnsupportedOperationException::class.java) {
            plane.sail()
        }
        assertContains(exception.message!!, "can't sail")
    }

    @Test
    fun flyBoat() {
        val boat = Boat()
        val exception = Assertions.assertThrows(UnsupportedOperationException::class.java) {
            boat.fly()
        }
        assertContains(exception.message!!, "can't fly")
    }

    @Test
    fun driveBoat() {
        val boat = Boat()
        val exception = Assertions.assertThrows(UnsupportedOperationException::class.java) {
            boat.drive()
        }
        assertContains(exception.message!!, "can't drive")
    }

    @Test
    fun sailBoat() {
        val boat = Boat()
        boat.sail()
    }
}