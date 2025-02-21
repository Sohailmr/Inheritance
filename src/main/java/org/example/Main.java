package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("John", "Doe", "W001", "Mr.", "1985", 20.0));
        workers.add(new Worker("Alice", "Smith", "W002", "Ms.", "1990", 25.0));
        workers.add(new Worker("Bob", "Johnson", "W003", "Dr.", "1982", 30.0));

        workers.add(new SalaryWorker("Emma", "Brown", "S001", "Mrs.", "1978", 22.0, 52000.0));
        workers.add(new SalaryWorker("Liam", "Miller", "S002", "Mr.", "1987", 28.0, 78000.0));
        workers.add(new SalaryWorker("Olivia", "Davis", "S003", "Ms.", "1995", 35.0, 104000.0));

        double[] weeklyHours = {40, 50, 40};

        System.out.println("| Name          | Week 1 Pay | Week 2 Pay | Week 3 Pay |");

        for (Worker worker : workers) {
            System.out.printf("| %-12s |", worker.getFirstName() + " " + worker.getLastName());
            for (double hours : weeklyHours) {
                double pay = worker.calculateWeeklyPay(hours);
                System.out.printf(" $%-10.2f |", pay);
            }
            System.out.println();
        }


    }
}
