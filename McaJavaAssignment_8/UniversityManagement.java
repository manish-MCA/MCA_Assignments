import java.util.Scanner;

class Student{
    Scanner s=new Scanner(System.in);
    public String rollNumber;
    protected String name;
    private double CGPA;
    Student(){
        System.out.println("\n\nEnter student details :\n");
        System.out.print("Enter student roll number : ");
        rollNumber=s.next();
        System.out.print("Enter student name : ");
        name=s.next();
        System.out.print("Enter student CGPA : ");
        CGPA=s.nextDouble();
    }
    void show(){
        System.out.println("\n\nStudent details :\n");
        System.out.print("Student roll number : "+rollNumber);
        System.out.print("\nStudent CGPA : "+CGPA);
    }
    public void updateCGPA(){
         System.out.print("\n\nEnter new CGPA score : ");
         CGPA=s.nextDouble();
         System.out.print("\nUpdated Student CGPA : "+CGPA);
    }
}

class  PostgraduateStudent extends Student{
    void showName(){
        System.out.println("\n\nStudent name from subclass : "+name);
    }
}
public class UniversityManagement{
    public static void main(String[] args) {
        PostgraduateStudent stud=new PostgraduateStudent();
        stud.show();
        stud.updateCGPA();
        stud.showName();
        
    }
}