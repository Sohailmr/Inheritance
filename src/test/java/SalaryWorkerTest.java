package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {
    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker worker = new SalaryWorker("John", "Doe", "12345", "Mr.", "1980", 20.0, 52000.0);
        assertEquals(1000.0, worker.calculateWeeklyPay(40), 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        SalaryWorker worker = new SalaryWorker("Jane", "Smith", "67890", "Ms.", "1985", 25.0, 78000.0);
        worker.displayWeeklyPay(40);
    }

    @Test
    public void testToCSV() {
        SalaryWorker worker = new SalaryWorker("Alice", "Johnson", "54321", "Dr.", "1975", 30.0, 104000.0);
        assertTrue(worker.toCSV().contains("104000.0"));
    }

    @Test
    public void testToJSON() {
        SalaryWorker worker = new SalaryWorker("Alice", "Johnson", "54321", "Dr.", "1975", 30.0, 104000.0);
        assertTrue(worker.toJSON().contains("\"annualSalary\":104000.0"));
    }

    @Test
    public void testToXML() {
        SalaryWorker worker = new SalaryWorker("Alice", "Johnson", "54321", "Dr.", "1975", 30.0, 104000.0);
        assertTrue(worker.toXML().contains("<annualSalary>104000.0</annualSalary>"));
    }
}

