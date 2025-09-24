package Scheduling;
import java.util.*;
import java.lang.*;
import java.io.*;

class FCFS {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);

        Process P1 = new Process(1, 0, 5);
        Process P2 = new Process(2, 2, 2);
        Process P3 = new Process(3, 4, 3);
        Process P4 = new Process(4, 6, 1);
        Process P5 = new Process(5, 8, 4);

        List<Process> processes = new ArrayList<>();
        processes.add(P1);
        processes.add(P2);
        processes.add(P3);
        processes.add(P4);
        processes.add(P5);

        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int i = 0;
        int timeLine = 0;
        //Table header
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Processes", "Arrival Time", "Burst Time", "Waiting Time", "Turnaround Time");
        System.out.println("-------------------------------------------------------------------------------");
        while(i<processes.size()){
            //Checking the order....
            //System.out.println(processes.get(i));

            Process current  = processes.get(i);
            int completionTime = timeLine + current.burstTime;
            int turnAroundTime = completionTime - current.arrivalTime;
            int waitingTime = turnAroundTime - current.burstTime;

            System.out.printf("%-10s %-15d %-15d %-15d %-15d%n", current, current.arrivalTime, current.burstTime, waitingTime, turnAroundTime);

            //increments
            timeLine = timeLine + current.burstTime;
            i++;


        }
        }
    }

    //Missing
    //user input , cpu idle condition?, exception handling, averages time