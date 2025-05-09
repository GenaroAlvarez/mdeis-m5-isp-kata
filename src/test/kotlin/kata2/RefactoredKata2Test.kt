package kata2

import kata2.refactored.BasicPrinter
import org.junit.jupiter.api.Test

class RefactoredKata2Test {

    @Test
    fun basicPrinterPrinting(){
        val basicPrinter = BasicPrinter()
        basicPrinter.print()
    }
}