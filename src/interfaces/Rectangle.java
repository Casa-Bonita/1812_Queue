package interfaces;

public class Rectangle implements Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSquare(){
        return a * b;
    }
}
