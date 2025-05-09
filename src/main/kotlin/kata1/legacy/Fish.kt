package kata1.legacy

class Fish: Animal {
    override fun fly() {
        throw NotImplementedError("Fish can't fly.")
    }

    override fun swim() {
        println("Fish is swimming!")
    }

    override fun run() {
        throw NotImplementedError("Fish can't run.")
    }
}