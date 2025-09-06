package SEP_06;
//Polymorphism
//"POLY" = "MANY"
//"MORPH" = "SHAPE"
//Objects can identify as other objects.
//Objects can be treated as objects of a common superclass.

class Car extends Vehicle{

    @Override
    void go(){
        System.out.println("You drive the car.");
    }
}

class Bike extends Vehicle{

    @Override
    void go(){
        System.out.println("You ride the boat.");
    }
}

class Boat extends Vehicle{

    @Override
    void go(){
        System.out.println("You sail the Boat.");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        //Car[] cars = {car, bike, boat}; <-- Error
        Vehicle[] vehicles = {car, bike, boat}; // <-- Works

        for(Vehicle vechicle : vehicles){
            vechicle.go();
        }
        //BTW you can also achieve this using INTERFACES.
        //Just change the extends to implements <Interface>
    }
}
