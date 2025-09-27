import java.util.*;


interface Department {
    void assignmentDepartment(String department );
    void getDepartment();
    
}
abstract class Employee implements Department{
    int id;
    String name;
    double baseSalary;
    abstract void calculateSalary(double baseSalary);
    void displayDetails(){
        System.out.println("Your Entered Data is : "+"\n Employee Id : "+id+"\n Employeee Name : "+name+"\n Employee Base Salary : "+baseSalary);
    };
    void setter(int id,String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        System.out.println("Your Data is Stored");
        return;
    }
    void getter(){
        System.out.println("Employee ID : "+id+"\n Name : "+name+"\n Base Salary :"+baseSalary);
        return;
    }
    
}


class FullTimeEmployee extends Employee {
    double bonus = 5000;
    double grossSalary;
    String departmentName;
    public void assignmentDepartment(String departmentName){
       this.departmentName = departmentName;

    }
    public void getDepartment(){
        System.out.println("Department : "+departmentName);
    }

    public void calculateSalary(double baseSalary){
        grossSalary = baseSalary + bonus;
    }


    void displayDetails(){
        System.out.println("The Details of a Employee ");

        System.out.println("Department : "+departmentName);
        System.out.println("The Gross Salary of the Employee is : "+grossSalary);
    }
}

class PartTimeEmployee extends Employee{
    double houryRate = 400;
    String departmentName;
    double hoursSWorked;
    double grossSalary;
     public void assignmentDepartment(String departmentName){
       this.departmentName = departmentName;

    }
    public void getDepartment(){
        System.out.println("Department : "+departmentName);
    }

    public void calculateSalary(double hoursSWorked){
        grossSalary = (houryRate * hoursSWorked);
    }

    void displayDetails(){
        System.out.println("The Details of a Employee ");

        System.out.println("Department : "+departmentName);
        System.out.println("The Gross Salary of the Employee is : "+grossSalary);
    }
}
public class employeemanagement  {

    public static void main(String[] args) {
        Employee em = new FullTimeEmployee();
        em.assignmentDepartment("Full Timer ");
        em.getDepartment();
        em.calculateSalary(50000);
        em.displayDetails();
        System.out.println(" ");
        System.out.println("========================");
        System.out.println(" ");
        System.out.println("Employee : 2 ");
        Employee em2 = new PartTimeEmployee();
        em2.assignmentDepartment("Part Timer ");
        em2.getDepartment();
        em2.calculateSalary(8);
        em2.displayDetails();
    }
}