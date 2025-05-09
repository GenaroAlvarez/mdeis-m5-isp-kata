package kata6.refactored

import kata6.refactored.interfaces.CryptoPayment

class CryptoProcessor : CryptoPayment {
    override fun processCrypto() {
        println("Processing crypto payment!")
    }
}