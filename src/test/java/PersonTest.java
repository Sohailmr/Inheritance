
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testToCSV() {
        Person person = new Person("John", "Doe", "1234", "Mr.", "1990");
        assertEquals("John,Doe,1234,Mr.,1990", person.toCSV());
    }

    @Test
    public void testToXML() {
        Person person = new Person("Jane", "Smith", "67890", "Ms.", "1985");
        String expectedXML = "<Person>" +
                "<firstName>Jane</firstName>" +
                "<lastName>Smith</lastName>" +
                "<ID>67890</ID>" +
                "<title>Ms.</title>" +
                "<YOB>1985</YOB>" +
                "</Person>";
        assertEquals(expectedXML, person.toXML());
    }

    @Test
    public void testToJSON() {
        Person person = new Person("Alice", "Johnson", "54321", "Dr.", "1975");
        String expectedJSON = "{\"firstName\":\"Alice\",\"lastName\":\"Johnson\",\"ID\":\"54321\",\"title\":\"Dr.\",\"YOB\":\"1975\"}";
        assertEquals(expectedJSON, person.toJSON());
    }

    @Test
    public void testImmutableID() {
        Person person = new Person("Bob", "Williams", "98765", "Prof.", "1965");
        assertEquals("98765", person.getID()); // ID should not change
    }

    @Test
    public void testSettersAndGetters() {
        Person person = new Person("Emily", "Clark", "11111", "Ms.", "2000");

        person.setFirstName("Emma");
        assertEquals("Emma", person.getFirstName());

        person.setLastName("Brown");
        assertEquals("Brown", person.getLastName());

        person.setTitle("Dr.");
        assertEquals("Dr.", person.getTitle());

        person.setYOB("1999");
        assertEquals("1999", person.getYOB());
    }
}

