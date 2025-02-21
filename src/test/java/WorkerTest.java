package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WorkerTest {
    @Test
    public void testCalculateWeeklyPay_NoOvertime() {
        Worker worker = new Worker("John", "Doe", "1234", "Mr.", "1990", 20.0);
        assertEquals(800.0, worker.calculateWeeklyPay(40)); // 40 hours * $20
    }

    @Test
    public void testCalculateWeeklyPay_WithOvertime() {
        Worker worker = new Worker("John", "Doe", "1234", "Mr.", "1990", 20.0);
        assertEquals(1100.0, worker.calculateWeeklyPay(50)); // 40 * $20 + 10 * ($20 * 1.5)
    }

    @Test
    public void testToCSV() {
        Worker worker = new Worker("Alice", "Smith", "5678", "Ms.", "1985", 25.0);
        assertEquals("Alice,Smith,5678,Ms.,1985,25.0", worker.toCSV());
    }

    @Test
    public void testToJSON() {
        Worker worker = new Worker("Alice", "Smith", "5678", "Ms.", "1985", 25.0);
        assertTrue(worker.toJSON().contains("\"hourlyPayRate\":25.0"));
    }

    @Test
    public void testToXML() {
        Worker worker = new Worker("Alice", "Smith", "5678", "Ms.", "1985", 25.0);
        assertTrue(worker.toXML().contains("<hourlyPayRate>25.0</hourlyPayRate>"));
    }
}
