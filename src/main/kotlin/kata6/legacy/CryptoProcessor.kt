package kata6.legacy

class CryptoProcessor : PaymentProcessor {
    override fun processCreditCard() {
        // Forced to implement
    }

    override fun processPayPal() {
        // Forced to implement
    }

    override fun processCrypto() {
        println("Processing crypto payment!")
    }
}