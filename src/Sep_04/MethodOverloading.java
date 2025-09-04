package Sep_04;
//It is not method overloading. It is actually method overridding.
//What's the difference you may ask?
//Well overloading occurs in same class but overrriding in different.
class A{
    public int ayu(){
        return 4;
    }
    public void meth2(){
        System.out.println("Im a method (second)");
    }
}
class B extends A{
     public void meth3(){
         System.out.println("I'm method 3.");
     }
    @Override
    public void meth2(){
        System.out.println("Im a method (second) from B");
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();

    }
}
