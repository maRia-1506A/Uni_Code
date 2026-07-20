interface system {
    public void bookFormat();
}

class PDF {
    public void pdfFormat() {
        System.out.println("The book is opened is pdf format");
    }
}

class EBOOK {
    public void ebookFormat() {
        System.out.println("The book is accessed by Ebook format");
    }
}

class pdfAdapter implements system {
    private PDF pdf;

    public pdfAdapter(PDF pdf) {
        this.pdf = pdf;
    }

    public void bookFormat() {
        pdf.pdfFormat();
    }
}

class ebookAdapter implements system {
    private EBOOK ebook;

    public ebookAdapter(EBOOK ebook) {
        this.ebook = ebook;
    }

    public void bookFormat() {
        ebook.ebookFormat();
    }
}

public class libraryManagement {
    public static void main(String[] args) {
        system pdfBased= new pdfAdapter(new PDF());
        system ebookBased= new ebookAdapter(new EBOOK());

        pdfBased.bookFormat();
        ebookBased.bookFormat();
    }
}

