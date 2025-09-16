import java.util.*;
public class Student {
    Scanner sc = new Scanner(System.in);
    String name ;
    int rollNumber ;
    int marks;
    String grade;

    void getStudentDetails(){
        System.out.println("Enter the Student Details : ");
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Roll Number : ");
        rollNumber = sc.nextInt();
        System.out.println("Enter Marks : ");
        marks = sc.nextInt();
        

    }
    void calculateGrade(){
        if (marks > 90){  
            System.out.println("Your Grade is :  A+ ");
            return;
        }
        else if(marks < 80 && marks > 70){
            System.out.println("Your Grade is :  B+ ");
        }
        else if(marks < 70 && marks > 60){
            System.out.println("Your Grade is :  B ");
        }
        else if(marks < 60 && marks > 50){
            System.out.println("Your Grade is :  C ");
        }
        else if(marks < 50 && marks > 40){
            System.out.println("Your Grade is :  Pass ");
        }else{
           System.out.println("Failed 🤡 "); 
        }
        
    }

    void displayStudentDetails(){
        System.out.println("Student Details : ");
        System.out.println("Name : ");
        System.out.println(name);
        System.out.println("Roll Number : ");
        System.out.println(rollNumber);
        System.out.println("Marks : ");
        System.out.println(marks);

    }
    public static void main(String[] args) {
        Student st = new Student();
        st.getStudentDetails();
        st.calculateGrade();
        st.displayStudentDetails();
    }
}
