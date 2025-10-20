package com.pluralsight.hotel_operations;

public class Employee {
    private String employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public double getTotalPay() {
        double totalPay = (this.payRate * getRegularHours()) + ((payRate * 1.5) * getOvertimeHours() );

        return totalPay;
    }

    public double getRegularHours() {
        double regularHours = 0;

        if (this.hoursWorked > 40.0) {
            regularHours = 40.0;
        } else {
            regularHours = this.hoursWorked;
        }

        return regularHours;
    }

    public double getOvertimeHours() {
        double overTimeHours = 0;

        if (this.hoursWorked > 40) {
            overTimeHours = this.hoursWorked - 40;
        }

        return overTimeHours;
    }

}
