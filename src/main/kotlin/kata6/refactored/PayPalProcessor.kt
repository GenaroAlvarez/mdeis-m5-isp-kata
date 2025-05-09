package kata6.refactored

import kata6.refactored.interfaces.PayPalPayment

class PayPalProcessor : PayPalPayment {
    override fun processPayPal() {
        println("Processing PayPal payment!")
    }
}