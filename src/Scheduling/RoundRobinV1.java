//package Scheduling;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//
//public class RoundRobinV1 {
//    static int noOfProcess = 0;
//    static int timeQuantum = 0;
//    static int arrivalTime = 0;
//    static int burstTime = 0;
//    static int completionTime = 0;
//    static int timeLine = 0;
//    static ArrayList<Process> processes = new ArrayList<>();
//    static ArrayList<Integer> waitingTime = new ArrayList<>();
//public class input{
//    Scanner scan = new Scanner(System.in);
//        waitingTime.add(0);
//
//        try {
//        System.out.print("Enter the number of Processes: ");
//        int noOfProcess = scan.nextInt();
//        System.out.print("Enter the Time Quantum of the system: ");
//        timeQuantum = scan.nextInt();
//
//    } catch(
//    InputMismatchException e) {
//        System.out.println("Enter Integers only.");
//        System.exit(0);
//    }
//
//        for(int i = 1;i < noOfProcess + 1; i++ ){
//
//        try {
//            System.out.print("Enter the arrival time and burst time of Process -> P"+i + ": ");
//            arrivalTime = scan.nextInt();
//            burstTime = scan.nextInt();
//        } catch(Exception e) {
//            System.out.println("Enter Integers only.");
//            System.exit(0);
//        }
//
//        processes.add(new Process(i,arrivalTime,burstTime));
//
//    }
//        System.out.println(processes);
//
//        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));}
//
//}
