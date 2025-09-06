package SEP_06;

class TalkingDog extends Animal{
    @Override
    void speaks(){
        System.out.println("Scooby says Hello Doggies");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speaks();

        //That can be done using
        Animal animal = new Animal() {
            @Override
            void speaks() {
                System.out.println("Scooby says hello Doggies");
            }
        };

        animal.speaks();
    }
}
