package kata6

import kata6.refactored.CreditCardProcessor
import kata6.refactored.CryptoProcessor
import kata6.refactored.PayPalProcessor
import org.junit.jupiter.api.Test

class RefactoredKata6Test {
    @Test
    fun creditCardProcessorProcessingCreditCardPayment() {
        val creditCardProcessor = CreditCardProcessor()
        creditCardProcessor.processCreditCard()
    }

    @Test
    fun payPalProcessorProcessingPayPalPayment() {
        val payPalProcessor = PayPalProcessor()
        payPalProcessor.processPayPal()
    }

    @Test
    fun cryptoProcessorProcessingCryptoPayment() {
        val cryptoProcessor = CryptoProcessor()
        cryptoProcessor.processCrypto()
    }
}