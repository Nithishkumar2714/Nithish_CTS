
interface Document {
    void open();
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();

    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}

class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        wordFactory.openDocument();

        DocumentFactory pdfFactory = new PdfFactory();
        pdfFactory.openDocument();

        DocumentFactory excelFactory = new ExcelFactory();
        excelFactory.openDocument();
    }
}