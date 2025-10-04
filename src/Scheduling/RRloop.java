//package Scheduling;
//
//import java.util.ArrayList;
//
//public class RRloop {
//    ArrayList<Process> processes = new ArrayList<>();
//    ArrayList<Integer> waitingTime = new ArrayList<>();
//    int noOfProcess;
//    int timeQuantum ;
//    int completionTime;
//    int timeLine;
//    int j;
//    Process current = processes.get(j);
//public void execute() {
//    while(j < noOfProcess) {
//        //Process next = processes.get(j+1);
//
//        if (timeLine < current.arrivalTime) {
//            timeLine += current.arrivalTime;
//        }
//
//        //Pj is executing
//        if (timeQuantum <= current.burstTime) {
//            completionTime = timeLine + current.burstTime;
//            current.burstTime -= timeQuantum;
//            timeLine += timeQuantum;
//            waitingTime.add(timeQuantum); //added waiting time at 0 index
//        } else { //i.e BT < TQ
//            completionTime = timeLine + current.burstTime;
//            timeLine += current.burstTime;
//            waitingTime.add(current.burstTime);
//            current.burstTime = 0;
//        }
//        System.out.println("TL\tID\tAT\tBT\tWT");
//        System.out.println(timeLine + "\t" + current.processID + "\t" + current.arrivalTime + "\t" + current.burstTime + "\t" + waitingTime.get(j));
//        j++;
//        System.out.println("\n");
//
//    }
//}
//
//    public RRloop(ArrayList<Process> processes,  int noOfProcess, int timeQuantum, int completionTime, int timeLine, int j, ArrayList<Integer> waitingTime) {
//        this.processes = processes;
//        this.waitingTime = waitingTime;
//        this.noOfProcess = noOfProcess;
//        this.timeQuantum = timeQuantum;
//        this.completionTime = completionTime;
//        this.timeLine = timeLine;
//        this.j = j;
//    }
//
//}
