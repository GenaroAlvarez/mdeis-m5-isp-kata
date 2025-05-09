package kata6.legacy

class CreditCardProcessor : PaymentProcessor {
    override fun processCreditCard() {
        println("Processing credit card payment!")
    }

    override fun processPayPal() {
        // Forced to implement
    }

    override fun processCrypto() {
        // Forced to implement
    }
}