import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer (40, 20);
    }

    @Test
    public void hasSheetsOfPaper(){
        assertEquals(40, printer.getSheetsOfPaper());
    }

    @Test
    public void canCountSheetsOfPaperAfterPrinting(){
        assertEquals(36, printer.print(2, 2));
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(20, printer.getTonerVolume());
    }

    @Test
    public void tonerReducesBy1ForEachPrintedPage() {
        assertEquals(16, printer.tonerReducesWhilePrinting(2, 2));
    }




}
