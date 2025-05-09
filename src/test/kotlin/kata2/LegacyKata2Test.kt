package kata2

import kata2.legacy.BasicPrinter
import org.junit.jupiter.api.Test

class LegacyKata2Test {

    @Test
    fun basicPrinterPrint(){
        val basicPrinter = BasicPrinter()
        basicPrinter.print()
    }

    @Test
    fun basicPrinterScan(){
        val basicPrinter = BasicPrinter()
        // Does nothing
        basicPrinter.scan()
    }

    @Test
    fun basicPrinterFax(){
        val basicPrinter = BasicPrinter()
        // Does nothing
        basicPrinter.fax()
    }
}