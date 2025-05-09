package kata1.legacy

class Fish: Animal {
    override fun fly() {
        // Forced to implement
    }

    override fun swim() {
        println("Fish is swimming!")
    }

    override fun run() {
        // Forced to implement
    }
}