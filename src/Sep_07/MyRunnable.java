package Sep_07;

public class MyRunnable implements Runnable{

    private final String text;

    MyRunnable(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i =1; i<=5; i++){
            try{
                System.out.println(Thread.currentThread().getName()+" " +i);
                System.out.println(text);
                Thread.sleep(1000);

            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i==5){
                System.out.println("Time's up.");
                System.exit(0);
            }
        }
    }
}
