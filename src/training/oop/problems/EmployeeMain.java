//Design an employee payroll system where you have a base abstract class Employee and two subclasses HourlyEmployee and SalariedEmployee. Each subclass has a different method for calculating the pay based on their type.
package training.oop.problems;
// Base Class
abstract class Employee {
    String name;

    //constructor
    Employee(String name) {
        this.name = name;
    }

    abstract double calculatePay();
}

// HourlyEmployee subclass
class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;    // Pay based on hours worked
    }
}

// SalariedEmployee subclass
class SalariedEmployee extends Employee {
    double annualSalary;

    SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    double calculatePay() {
        return annualSalary / 12;         // Monthly salary
    }
}


public class EmployeeMain {
    public static void main(String[] args) {
        Employee hourly = new HourlyEmployee("Amna", 20, 160);
        Employee salaried = new SalariedEmployee("Ali", 60000);
        
        System.out.println(hourly.name + "'s Pay: $" + hourly.calculatePay());
        System.out.println(salaried.name + "'s Pay: $" + salaried.calculatePay());
    }
}
