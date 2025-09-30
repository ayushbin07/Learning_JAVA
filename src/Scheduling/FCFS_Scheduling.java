package Scheduling;

import java.util.Scanner;

public class FCFS_Scheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of processes
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] pid = new int[n];       // process IDs
        int[] at = new int[n];        // arrival time
        int[] bt = new int[n];        // burst time
        int[] ct = new int[n];        // completion time
        int[] tat = new int[n];       // turnaround time
        int[] wt = new int[n];        // waiting time

        // Input process details
        for (int i = 0; i < n; i++) {
            pid[i] = i + 1;
            System.out.print("Enter arrival time of process " + pid[i] + ": ");
            at[i] = sc.nextInt();
            System.out.print("Enter burst time of process " + pid[i] + ": ");
            bt[i] = sc.nextInt();
        }

        // Sorting processes by arrival time (simple bubble sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (at[j] > at[j + 1]) {
                    // swap arrival time
                    int temp = at[j];
                    at[j] = at[j + 1];
                    at[j + 1] = temp;

                    // swap burst time
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;

                    // swap process IDs
                    temp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = temp;
                }
            }
        }

        // Calculate CT, TAT, WT
        int time = 0;
        for (int i = 0; i < n; i++) {
            if (time < at[i]) {
                time = at[i]; // if CPU is idle
            }
            ct[i] = time + bt[i];
            time = ct[i];

            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
        }

        // Output results
        System.out.println("\nPID\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println(pid[i] + "\t" + at[i] + "\t" + bt[i] + "\t" +
                    ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        // Average TAT and WT
        double avgTAT = 0, avgWT = 0;
        for (int i = 0; i < n; i++) {
            avgTAT += tat[i];
            avgWT += wt[i];
        }

        System.out.printf("\nAverage Turnaround Time = %.2f", avgTAT / n);
        System.out.printf("\nAverage Waiting Time = %.2f\n", avgWT / n);

        sc.close();
    }
}
