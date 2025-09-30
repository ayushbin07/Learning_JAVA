package Scheduling;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RoundRobinV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Process> processes = new ArrayList<>();
        ArrayList<Integer> waitingTime = new ArrayList<>();
        waitingTime.add(0);

        int noOfProcess = 0;
        int timeQuantum = 0;
        int arrivalTime = 0;
        int burstTime = 0;
        int completionTime = 0;

        try {
            System.out.print("Enter the number of Processes: ");
            noOfProcess = scan.nextInt();
            System.out.print("Enter the Time Quantum of the system: ");
            timeQuantum = scan.nextInt();

        } catch(InputMismatchException e) {
            System.out.println("Enter Integers only.");
            System.exit(0);
        }

        for(int i = 1;i < noOfProcess + 1; i++ ){

            try {
                System.out.print("Enter the arrival time and burst time of Process -> P"+i + ": ");
                arrivalTime = scan.nextInt();
                burstTime = scan.nextInt();
            } catch(Exception e) {
                System.out.println("Enter Integers only.");
                System.exit(0);
            }

            processes.add(new Process(i,arrivalTime,burstTime));

        }
        System.out.println(processes);

        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int timeLine = 0;
        for (int j = 0 ; j < processes.size() ; j++){
            Process current = processes.get(j);
            //Process next = processes.get(j+1);

            if (timeLine<current.arrivalTime){
                timeLine += current.arrivalTime;
            }

            //Pj is executing
            if (timeQuantum <= current.burstTime){
                completionTime = timeLine + current.burstTime;
                current.burstTime -= timeQuantum;
                timeLine += timeQuantum;
                waitingTime.add(timeQuantum); //added waiting time at 0 index
            }
            else{ //i.e BT < TQ
                completionTime = timeLine + current.burstTime;
                timeLine += current.burstTime;
                waitingTime.add(current.burstTime);
                current.burstTime = 0;
            }
            System.out.println("TL\tID\tAT\tBT\tWT");
            System.out.println(timeLine+"\t"+ current.processID+"\t"+current.arrivalTime+"\t"+current.burstTime+"\t"+ waitingTime.get(j));
        }

    }
}
