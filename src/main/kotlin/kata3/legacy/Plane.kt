package kata3.legacy

class Plane : Vehicle {
    override fun drive() {
        throw UnsupportedOperationException("Plane can't drive")
    }

    override fun fly() {
        println("Plane is flying!")
    }

    override fun sail() {
        throw UnsupportedOperationException("Plane can't sail")
    }
}