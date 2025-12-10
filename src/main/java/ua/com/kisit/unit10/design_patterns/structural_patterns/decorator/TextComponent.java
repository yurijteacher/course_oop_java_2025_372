package ua.com.kisit.unit10.design_patterns.structural_patterns.decorator;

public class TextComponent implements Component{
    @Override
    public void draw() {
        System.out.println("Text Text Text");
    }
}
