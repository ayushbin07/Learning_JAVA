package Sep_04;
class FirstClass{
    int x=2;

    public FirstClass(int x) {
        this.x = x;//This is a refrence that refers to the object being created.
        //In this case this will refer to FirstClass like FirstClass.getX()
        //Something like that.
    }
public FirstClass(){
        this.x =x;
}
    public int getX() {
        return x;
    }
}
class SecondClass extends FirstClass{
    int y=4;

    public SecondClass(int x, int y) {
        super(x); //Helps to call constructer with variable x in parent class.
        //If this is not present constructor with no variable is run. The one at line 10,11 and 12.
        //It is a refrence variable used to refer immediate parent class.
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
public class ThisAndSuper {

}
