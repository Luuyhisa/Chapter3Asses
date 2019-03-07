package za.ac.cput.Chapter3Asses;

public class Rectangle {
    private int width, length;
    public Rectangle() {
        this(0,0);
    }
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int area() {
        int outPut=width * length;
        return outPut;
    }
    public int perimeter() {
        int outPut=((width*2) +(length*2));
        return outPut;
    }


}
