package Scheduling;

import java.util.Random;
import java.util.Scanner;

public class ProcessExecutionTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Input: number of processes
        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();

        // Input: processor speed in million instructions per second
        System.out.print("Enter processor speed (in million instructions per second): ");
        int processorSpeedMillion = sc.nextInt();

        // Convert processor speed to actual instructions per second
        long processorSpeed = (long) processorSpeedMillion * 1_000_000;

        // Generate random process sizes (in million instructions)
        int[] processes = new int[n];
        for (int i = 0; i < n; i++) {
            processes[i] = rand.nextInt(191) + 10; // random 10–200
        }

        System.out.println("\n--- Process Execution Simulation ---");
        System.out.println("Processor Speed: " + processorSpeedMillion + " million instructions per second\n");

        double totalTime = 0.0;

        for (int i = 0; i < n; i++) {
            int sizeMillion = processes[i];
            long instructions = (long) sizeMillion * 1_000_000;

            // Execution time = instructions / processor speed
            double execTime = (double) instructions / processorSpeed;

            totalTime += execTime;

            System.out.printf("Process %d: Size = %d million instructions -> Execution Time = %.6f seconds%n",
                    (i + 1), sizeMillion, execTime);
        }

        System.out.printf("%nTotal Execution Time for %d processes = %.6f seconds%n", n, totalTime);

        sc.close();
    }
}
