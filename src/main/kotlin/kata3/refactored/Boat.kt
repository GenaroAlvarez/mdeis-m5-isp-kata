package kata3.refactored

import kata3.refactored.interfaces.Sailable

class Boat : Sailable {
    override fun sail() {
        println("Boat is sailing!")
    }
}