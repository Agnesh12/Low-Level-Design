package Decorator;

public class TextManager {
    public static void main(String[] args) {
        Text myText = new SimpleText("Hello World");
        Text bold = new BoldText(myText);
        System.out.println(bold.write());
        Text italicText = new ItalicText(new BoldText(myText));
        System.out.println(italicText.write());
        Text styled = new UnderLineText(new ItalicText(new BoldText(myText)));
        System.out.println(styled.write());
    }
}
