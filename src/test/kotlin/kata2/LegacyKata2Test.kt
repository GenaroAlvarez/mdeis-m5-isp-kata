package kata2

import kata2.legacy.BasicPrinter
import org.junit.jupiter.api.Test

class LegacyKata2Test {

    @Test
    fun basicPrinterPrinting(){
        val basicPrinter = BasicPrinter()
        basicPrinter.print()
    }

    @Test
    fun basicPrinterScanning(){
        val basicPrinter = BasicPrinter()
        // Does nothing
        basicPrinter.scan()
    }

    @Test
    fun basicPrinterFaxing(){
        val basicPrinter = BasicPrinter()
        // Does nothing
        basicPrinter.fax()
    }
}