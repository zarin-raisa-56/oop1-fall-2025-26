class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String toString() {
        return "Title: " + title + ", Salary: $" + salary;
    }
}


class Employee {
    private String name;
    private Position position; // Employee HAS a Position

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void showEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
    }
}


class Company {
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int numberOfEmployees) {
        this.companyName = companyName;
        this.employees = new Employee[numberOfEmployees]; 
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Cannot add more employees to " + companyName);
        }
    }

    public void showEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees:");
        for (int i = 0; i < count; i++) {
            employees[i].showEmployeeInfo();
            System.out.println();
        }
    }
}
public class TaskFinal2 {
    public static void main(String[] args) {

        
        Company company = new Company("TechNova Ltd", 2); 

        Position p1 = new Position("Software Engineer", 75000);
        Position p2 = new Position("Project Manager", 90000);

        Employee e1 = new Employee("Alice", p1);
        Employee e2 = new Employee("Bob", p2);

        company.addEmployee(e1);
        company.addEmployee(e2);

        company.showEmployees();
    }
}
