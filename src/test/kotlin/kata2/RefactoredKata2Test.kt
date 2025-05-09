package kata2

import kata2.refactored.BasicPrinter
import org.junit.jupiter.api.Test

class RefactoredKata2Test {

    @Test
    fun basicPrinterPrint(){
        val basicPrinter = BasicPrinter()
        basicPrinter.print()
    }

//    @Test
//    fun basicPrinterScan(){
//        val basicPrinter = BasicPrinter()
//        basicPrinter.scan()
//    }
//
//    @Test
//    fun basicPrinterFax(){
//        val basicPrinter = BasicPrinter()
//        basicPrinter.fax()
//    }
}