import java.util.Scanner;

public class DisplayEmployeeDetails {
Scanner sc = new Scanner(System.in);
String name ;
int id ;
float salary ;

public void getDetails(){
    System.out.println("Enter The Employerr Details : ");
    System.out.println("Name : ");
    name = sc.next();
    System.out.println("Id : ");
    id = sc.nextInt();
    System.out.println("Salary : ");
    salary = sc.nextFloat();
}

public void show(){
     System.out.println("The Employerr Details are : ");
    System.out.println("Name : "+name);
    System.out.println("Id : "+id);
    System.out.println("Salary : "+salary);
}

public static void main(String[] args) {
    DisplayEmployeeDetails obj = new DisplayEmployeeDetails();
    obj.getDetails();
    obj.show();
}
    
}