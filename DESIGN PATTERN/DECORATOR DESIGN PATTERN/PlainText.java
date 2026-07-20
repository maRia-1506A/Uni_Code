interface Text {
    String format();
}

public class PlainText implements Text {
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String format() {
        return text;
    }

    public static void main(String[] args) {
        Text text = new PlainText("SWE");

        // Apply decorators dynamically
        text = new BoldDecorator(text);
        text = new ItalicDecorator(text);
        text = new UnderlineDecorator(text);

        System.out.println(text.format());
    }
}

abstract class TextDecorator implements Text {
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }
}

class BoldDecorator extends TextDecorator {
    public BoldDecorator(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<b>" + text.format() + "</b>";
    }
}

class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<i>" + text.format() + "</i>";
    }
}

class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<u>" + text.format() + "</u>";
    }
}