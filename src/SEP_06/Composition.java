package SEP_06;

//Composition Represents a "part-of" relationship between objects.
//For example, an Engine is "part of a Car.
//Allows complex objects to be constructed from smaller objects.

class CarAB{
    String model;
    int year;
    Engine engine;

    public CarAB(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The "+model+" is running.");
    }
}

class Engine{
    String type;
    public Engine(String type) {
        this.type = type;
    }

    public void start(){
        System.out.println("You car is starting.");
    }

    @Override
    public String toString(){
        return type;
    }
}



public class Composition {
    public static void main(String[] args) {
        CarAB car = new CarAB("Ferrari",2025,"V12");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine);

        car.start();
    }
}
