abstract class Document {
    public abstract void create();
}

class WordDocument extends Document {
    public void create() {
        System.out.println("Creating Word Document");
    }
}

class PdfDocument extends Document {
    public void create() {
        System.out.println("Creating PDF Document");
    }
}

class ExcelDocument extends Document {
    public void create() {
        System.out.println("Creating Excel Document");
    }
}
