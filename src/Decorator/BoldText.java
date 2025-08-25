package Decorator;

public class BoldText extends TextDecorator{
    public Text text;
        public BoldText(Text text) {
            super(text);
        }
        @Override
        public String write() {
            return "<b>" + text.write() + "<t>";
        }
}
