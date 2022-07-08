package ge.ufc.main;

public class Triangle extends Figure implements Comparable<Triangle> {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int getLength() {
        return sideA + sideB + sideC;
    }

    @Override
    public int getArea() {
        int perHalf = getLength() / 2;
        return (int) Math.sqrt(perHalf * (perHalf-sideA) * (perHalf-sideB) * (perHalf-sideC));
    }



    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public int compareTo(Triangle tri) {
        return Integer.compare(this.getLength(), tri.getLength());
    }
}
