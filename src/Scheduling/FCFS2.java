package Scheduling;

import java.util.*;
import java.lang.*;
import java.io.*;

class FCFS2 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Process> processes = new ArrayList<>();
        int noOfProcess = 0;
        try {
            System.out.print("Enter the number of Processes: ");
            noOfProcess = scan.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Enter only Integers.");
            System.exit(0);
        }

        int j = 1;
        while(j < noOfProcess + 1) {
            System.out.print("Enter arrival and burst time for P" + j + ": ");
            int arrivalTime = 0;
            int burstTime = 0;
            try {
                arrivalTime = scan.nextInt();
                burstTime = scan.nextInt();
            } catch(Exception e) {
                System.out.println("Enter only integer. ");
                System.exit(0);
            }

            processes.add(new Process(j, arrivalTime, burstTime));
            j++;
        }

        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int i = 0;
        int timeLine = 0;
        int totalWaitingTime = 0, totalTurnAroundTime = 0;
        //Table header
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Processes", "Arrival Time", "Burst Time", "Waiting Time", "Turnaround Time");
        System.out.println("-------------------------------------------------------------------------------");
        while(i < processes.size()) {
            //Checking the order....
            //System.out.println(processes.get(i));

            Process current = processes.get(i);
            //What if CPU is idle??
            if (current.arrivalTime > timeLine) {
                timeLine = current.arrivalTime;
            }

            //Calculation
            int completionTime = timeLine + current.burstTime;
            int turnAroundTime = completionTime - current.arrivalTime;
            int waitingTime = turnAroundTime - current.burstTime;


            //For Average Part
            totalWaitingTime += waitingTime;
            totalTurnAroundTime += turnAroundTime;

            System.out.printf("%-10s %-15d %-15d %-15d %-15d%n", current, current.arrivalTime, current.burstTime, waitingTime, turnAroundTime);


            //increments
            timeLine = timeLine + current.burstTime;
            i++;
        }
        //Average
        System.out.print("Avg. Waiting Time: " + totalWaitingTime / processes.size() + "\n");
        System.out.print("Avg Turnaround Time: " + totalTurnAroundTime / processes.size());
    }
}

//Working