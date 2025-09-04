
class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;

    }
}
public class SEP_04 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(10,10);
        myCylinder.getHeight();
        myCylinder.setHeight(20);

    }
}
