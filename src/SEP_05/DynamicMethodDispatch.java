package SEP_05;
//class One{
//    public void name(){
//        System.out.println("My name is JAVA");
//    }
//    public void greeting(){
//        System.out.println("Hello");
//    }
//}
//class Two extends One{
//    @Override
//    public void name(){
//        System.out.println("My name is JAVA(2)");
//    }
//    public void swagat(){
//        System.out.println("Namaste");
//    }
//}
//public class DynamicMethodDispatch {
//    public static void main(String[] args) {
//        //One object = new One();
//        //Two obj = new Two();
//        //Or maybe
//        One obj = new Two(); //Woah..
//        //Two obj = new One(); <-- Not allowed
//        obj.greeting();
//        obj.name();
//        //obj.swagat(); <-- Not allowed. Why? Because it is referred as Class one.
//    }
//}
//
//make a new code using Phone and SmartPhone


class Phone {
    public void call() {
        System.out.println("Phone: Making a call...");
    }

    public void message() {
        System.out.println("Phone: Sending a message...");
    }
}

class SmartPhone extends Phone {
    @Override
    public void call() {
        System.out.println("SmartPhone: Making a video call...");
    }

    public void browse() {
        System.out.println("SmartPhone: Browsing the internet...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone reference, Phone object
        // Phone p1 = new Phone();

        // SmartPhone reference, SmartPhone object
        // SmartPhone sp1 = new SmartPhone();

        // Dynamic Method Dispatch
        Phone obj = new SmartPhone(); // reference is Phone, object is SmartPhone

        obj.call();     // Executes SmartPhone's version
        obj.message();  // Executes Phone's version
        // obj.browse(); // ❌ Not allowed, because reference type is Phone
    }
}
