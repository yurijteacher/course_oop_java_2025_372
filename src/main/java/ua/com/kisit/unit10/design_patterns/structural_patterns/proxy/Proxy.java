package ua.com.kisit.unit10.design_patterns.structural_patterns.proxy;

public class Proxy implements Image{

    String file;

    public Proxy(String file) {
        this.file = file;
    }

    MyImage myImage;


    @Override
    public void display() {
        if(myImage == null){
            myImage = new MyImage(file);
        }

        copyFiles(file);
    }

    private void copyFiles(String file) {
        System.out.println("Copying file: " + file);
    }
}
