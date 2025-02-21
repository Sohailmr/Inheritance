package org.example;

public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName,String ID, String tile, String YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, tile, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
            return hourlyPayRate;
    }
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    public double calculateWeeklyPay(double hoursWorked){
        double regularHours=Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return(regularHours*hourlyPayRate) + (overtimeHours*hourlyPayRate*1.5);

    }
    public void displayWeeklyPay(double hoursWorked){
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * hourlyPayRate * 1.5;
        double totalPay = regularPay + overtimePay;

        System.out.println("Regular Hours: " + regularHours + " | Regular Pay: $" + regularPay);
        System.out.println("Overtime Hours: " + overtimeHours + " | Overtime Pay: $" + overtimePay);
        System.out.println("Total Weekly Pay: $" + totalPay);

    }
    @Override
    public String toCSV() {
        return super.toCSV() + "," + hourlyPayRate;
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}", ",\"hourlyPayRate\":" + hourlyPayRate + "}");
    }

    @Override
    public String toXML() {
        return super.toXML().replace("</Person>", "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate></Person>");
    }

}
