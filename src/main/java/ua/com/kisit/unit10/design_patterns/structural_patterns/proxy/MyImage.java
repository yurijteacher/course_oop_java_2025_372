package ua.com.kisit.unit10.design_patterns.structural_patterns.proxy;

public class MyImage implements Image{

    String file;

    public MyImage(String file) {
        this.file = file;
        loadFile(file);
    }

    private void loadFile(String file) {
        System.out.println("Loading file: " + file);
    }

    @Override
    public void display() {
        System.out.println("Opening file: " + file);
    }
}
