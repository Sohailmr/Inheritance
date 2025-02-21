package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private final String ID;
    private String title;
    private String YOB;

    public Person(String firstName, String lastName, String ID, String title, String YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }


    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getID() { return ID; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getYOB() { return YOB; }
    public void setYOB(String YOB) { this.YOB = YOB; }

    public String toCSV() {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    public String toJSON() {
        return "{\"firstName\":\"" + firstName + "\",\"lastName\":\"" + lastName +
                "\",\"ID\":\"" + ID + "\",\"title\":\"" + title + "\",\"YOB\":\"" + YOB + "\"}";
    }

    public String toXML() {
        return "<Person>" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<ID>" + ID + "</ID>" +
                "<title>" + title + "</title>" +
                "<YOB>" + YOB + "</YOB>" +
                "</Person>";
    }

}
