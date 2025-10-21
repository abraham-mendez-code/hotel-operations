package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private String employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchIn;
    private double punchOut;

    public Employee(String employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        double totalPay = (this.payRate * getRegularHours()) + ((payRate * 1.5) * getOvertimeHours() );

        return totalPay;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {

        return getHoursWorked() > 40 ? getHoursWorked() - 40 : 0;

    }

    public void punchIn (double time) {

        this.punchIn = punchIn;

    }

    // overloaded parameterless punchIn method which uses the current time
    public void punchIn () {
        //get the current time
        LocalTime localTime = LocalTime.now();

        // get the current time as a double
        double time = (localTime.getHour() + (double) localTime.getMinute() / 60);

        this.punchIn = time;
    }

    public void punchOut (double time) {

        this.punchOut = time;

    }

    // overloaded parameterless punchOut method which uses the current time
    public void punchOut () {
        //get the current time
        LocalTime localTime = LocalTime.now();

        // get the current time as a double
        double time = (localTime.getHour() + (double) localTime.getMinute() / 60);

        this.punchOut = time;
    }

    public double getPunchIn() {
        return punchIn;
    }

    public double getPunchOut() {
        return punchOut;
    }
}
