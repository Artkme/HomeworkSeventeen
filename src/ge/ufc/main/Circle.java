package ge.ufc.main;

public class Circle extends Figure implements Comparable<Circle> {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getLength() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle circle) {
        return Integer.compare(this.getLength(), circle.getLength());
    }

    @Override
    public String toString() {
        return "Radius: " + radius;
    }

    @Override
    public boolean equals(Object o) {
        Circle c = (Circle) o;
        return this.getLength() == c.getLength();
    }

    @Override
    public int hashCode() {
        return radius;
    }
}
