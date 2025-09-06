package Sep_07;

import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable("Hello");
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You get 5 sec to enter your name");
        String name = sc.nextLine();
        System.out.println("Hello "+name);

        sc.close();
    }
}
