package kata3.legacy

class Boat : Vehicle {
    override fun drive() {
        throw UnsupportedOperationException("Boat can't drive")
    }

    override fun fly() {
        throw UnsupportedOperationException("Boat can't fly")
    }

    override fun sail() {
        println("Boat is sailing!")
    }
}