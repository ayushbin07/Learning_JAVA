package SEP_06;

//Interface A blueprint for a class that specifies a set of abstract methods
//that implementing classes MUST define.
//Supports multiple inheritance-like behavior.
class Rabbit implements Prey{

    @Override
    public void flee(){
        System.out.println("The rabbit is running away.");
    }
}

class Fish implements Prey,Predator{

    @Override
    public void flee(){
        System.out.println("It is swimming away.");
    }
     @Override
    public void hunt(){
         System.out.println("Big Fishes can hunt small fishes. It is hunting");
     }
}

class Hwak implements Predator{

    @Override
    public void hunt(){
        System.out.println("The hwak is hunting.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hwak hwak = new Hwak();
        hwak.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }


}
