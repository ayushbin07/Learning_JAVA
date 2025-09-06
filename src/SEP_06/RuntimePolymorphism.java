package SEP_06;

import java.util.Scanner;

//Runtime polymorphism = When the method that gets executed is decided
//at runtime based on the actual type of the object .1
class Dog extends Animal{

    @Override
    void speaks(){
        System.out.println("The dog goes woof.");
    }
}

class Cat extends Animal{

    @Override
    void speaks(){
        System.out.println("The cat goes meow.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal animal;

        System.out.print("Cat or Dog? 1 or 2?: ");
        int choice = sc.nextInt();

        if (choice == 1 ){
            animal = new Dog();
            animal.speaks();
        } else {
            animal = new Cat();
            animal.speaks();
        }
    }
}
