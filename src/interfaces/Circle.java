package interfaces;

public class Circle implements Shape{
    private int r;

    public Circle(int r) {
        this.r = r;
    }


    @Override
    public int getSquare() {
        return (int)Math.PI*r*r;
    }
}
