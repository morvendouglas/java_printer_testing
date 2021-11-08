public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume) {
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper() {
        return this.sheetsOfPaper;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public int print(int noOfPages, int noOfCopies) {
        if (this.sheetsOfPaper >= noOfPages * noOfCopies) {
            return this.sheetsOfPaper - noOfPages * noOfCopies;
        } else {
            return this.sheetsOfPaper;
        }
    }

    public int tonerReducesWhilePrinting(int noOfPages, int noOfCopies) {
        if (this.sheetsOfPaper >= noOfPages * noOfCopies) {
            return this.tonerVolume - noOfPages * noOfCopies;
        } else {
            return this.tonerVolume;
        }
    }

}
