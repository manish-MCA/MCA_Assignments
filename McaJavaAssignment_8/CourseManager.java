import java.util.Scanner;

class Course{
    Scanner sc = new Scanner(System.in);
    String courseName;
    int duration;
    double fee;
    static String institueName="XYZ institute";
    Course(){
        System.out.println("\n\nEnter course details : ");
        System.out.print("\nEnter course name : ");
        courseName=sc.next();
        System.out.print("\nEnter course duration (days) : ");
        duration=sc.nextInt();
        System.out.print("Enter course fee (Rs.) : ");
        fee=sc.nextDouble();
  }
    void displayCourseDetails(){
        System.out.println("\n\nCourse details :\n");
        System.out.println("Name of the course : "+courseName);
        System.out.println("Duration of the course : "+duration+" days");
        System.out.println("Fee of the course : Rs. "+fee);
        System.out.println("Name of the institute : "+institueName);
    }

    void updateInstituteName(){
        System.out.print("\nEnter new institue name : ");
        institueName=sc.next();
        System.out.println("Updated name of the institute : "+institueName);
    }
}

public class CourseManager{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("\n\nEnter number of courses : ");
        int num=scan.nextInt();
        Course[] courses=new Course[num];
        System.out.println("\nEnter details of the courses :\n");
        for (int i=0;i<num;i++){
            courses[i]=new Course(); 
        }
        System.out.println("\nDetails of the courses :\n");
        for (int i=0;i<num;i++){
            courses[i].displayCourseDetails();
        }
        courses[0].updateInstituteName();
        System.out.println("\nDetails of the courses after updating the institute name :");
        for (int i=0;i<num;i++){
            courses[i].displayCourseDetails();
        }
    }
}