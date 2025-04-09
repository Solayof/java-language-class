import java.awt.*;

public class Rectangle {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void area() {
        System.out.println("Area of Rectangle "+ x*y);
    }
}
