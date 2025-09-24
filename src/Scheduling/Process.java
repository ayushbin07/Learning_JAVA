package Scheduling;

class Process {
    int processID;
    // int completeTime;
    int arrivalTime;
    int burstTime;
    // int waitingTime;
    // int turnaroundTime;

    // Constructor
    public Process(int processID, int arrivalTime, int burstTime) {
        this.processID = processID;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }

    @Override
    public String toString() {
        return "P" + processID + " [AT=" + arrivalTime + ", BT=" + burstTime + "]";
    }
}
