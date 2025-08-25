package Decorator;

public class TextDecorator implements Text{
    private Text decoratedText;
    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }
    @Override
    public String write() {
        return decoratedText.write();
    }
}
