package kata6

import kata6.legacy.CreditCardProcessor
import kata6.legacy.CryptoProcessor
import kata6.legacy.PayPalProcessor
import org.junit.jupiter.api.Test

class LegacyKata6Test {
    @Test
    fun creditCardProcessorProcessingCreditCardPayment() {
        val creditCardProcessor = CreditCardProcessor()
        creditCardProcessor.processCreditCard()
    }

    @Test
    fun creditCardProcessorProcessingPayPalPayment() {
        val creditCardProcessor = CreditCardProcessor()
        creditCardProcessor.processPayPal()
    }

    @Test
    fun creditCardProcessorProcessingCryptoPayment() {
        val creditCardProcessor = CreditCardProcessor()
        creditCardProcessor.processCrypto()
    }

    @Test
    fun payPalProcessorProcessingCreditCardPayment() {
        val payPalProcessor = PayPalProcessor()
        payPalProcessor.processCreditCard()
    }

    @Test
    fun payPalProcessorProcessingPayPalPayment() {
        val payPalProcessor = PayPalProcessor()
        payPalProcessor.processPayPal()
    }

    @Test
    fun payPalProcessorProcessingCryptoPayment() {
        val payPalProcessor = PayPalProcessor()
        payPalProcessor.processCrypto()
    }

    @Test
    fun cryptoProcessorProcessingCreditCardPayment() {
        val cryptoProcessor = CryptoProcessor()
        cryptoProcessor.processCreditCard()
    }

    @Test
    fun cryptoProcessorProcessingPayPalPayment() {
        val cryptoProcessor = CryptoProcessor()
        cryptoProcessor.processPayPal()
    }

    @Test
    fun cryptoProcessorProcessingCryptoPayment() {
        val cryptoProcessor = CryptoProcessor()
        cryptoProcessor.processCrypto()
    }
}