package Sep_04;
class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Base(int x) {
        this.x = x;
        System.out.println("I'm the first Constructor.");
    }
    public Base(){
        this.x = 10;
        System.out.println("If no argument is passed I get to work.");
    }
}

class Derived extends Base {

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Derived(int x, int y) {
        super(x);
        System.out.println("I'm the second Constructor.");
        this.y = y;
    }
}
class GrandDerived extends Derived{
    public  int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public GrandDerived(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("I'm am the third constructor.");
    }
}
//Made commit to GITHUB at September 04 10:58commi
public class ConstructorInInheritance {
    public static void main(String[] args) {
        GrandDerived gd = new GrandDerived(1,2,3);
    }
}
