package Decorator;

public class SimpleText implements Text{
    String content;
    public SimpleText(String content) {
        this.content = content;
    }
    @Override
    public String write() {
        return content;
    }
}
