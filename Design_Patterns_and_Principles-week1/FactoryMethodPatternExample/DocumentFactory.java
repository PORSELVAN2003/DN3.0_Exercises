abstract class DocumentFactory {
    public abstract Document createDocument();

    public static DocumentFactory getFactory(String type) {
        switch (type) {
            case "Word":
                return new WordDocumentFactory();
            case "PDF":
                return new PdfDocumentFactory();
            case "Excel":
                return new ExcelDocumentFactory();
            default:
                throw new IllegalArgumentException("Unknown document type");
        }
    }
}

class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
