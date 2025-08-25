package Decorator;

public class ItalicText extends TextDecorator{
    public Text text;
    public ItalicText(Text text) {
        super(text);
    }
    @Override
    public String write() {
        return "<i>" + text.write() + "<i>";
    }
}
