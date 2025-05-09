package kata6.refactored

import kata6.refactored.interfaces.CreditCardPayment

class CreditCardProcessor : CreditCardPayment {
    override fun processCreditCard() {
        println("Processing credit card payment!")
    }
}