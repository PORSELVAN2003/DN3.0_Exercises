public class FactoryMethodTest {
    public static void main(String[] args) {

        DocumentFactory wordFactory = DocumentFactory.getFactory("Word");
        Document wordDoc = wordFactory.createDocument();
        wordDoc.create();

        DocumentFactory pdfFactory = DocumentFactory.getFactory("PDF");
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.create();

        DocumentFactory excelFactory = DocumentFactory.getFactory("Excel");
        Document excelDoc = excelFactory.createDocument();
        excelDoc.create();
    }
}
