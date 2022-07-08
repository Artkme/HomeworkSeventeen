package ge.ufc.main;

public class Rectangle extends Figure implements Comparable<Rectangle> {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public int getLength() {
        return 2 * (width + height);
    }

    @Override
    public int getArea() {
        return width * height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int compareTo(Rectangle rect) {
        return Integer.compare(this.getLength(), rect.getLength());
    }
}
