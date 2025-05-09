package kata6.legacy

class PayPalProcessor : PaymentProcessor {
    override fun processCreditCard() {
        // Forced to implement
    }

    override fun processPayPal() {
        println("Processing PayPal payment!")
    }

    override fun processCrypto() {
        // Forced to implement
    }
}