package Decorator;

public class UnderLineText extends TextDecorator{
    public Text text;
    public UnderLineText(Text text) {
        super(text);
    }
    @Override
    public String write() {
        return "<u>" + text.write() + "<u>";
    }
}
