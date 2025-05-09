package kata6.legacy

interface PaymentProcessor {
    fun processCreditCard()
    fun processPayPal()
    fun processCrypto()
}