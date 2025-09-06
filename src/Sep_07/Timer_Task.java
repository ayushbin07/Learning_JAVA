package Sep_07;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_Task {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int count =3;
            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                if(count<=0){
                    System.out.println("Task Complete");
                    timer.cancel();
                }
            }
        };
        //task.run();
        // Runs the task once after 3 seconds
        timer.schedule(task, 0, 1000);
    }
}
