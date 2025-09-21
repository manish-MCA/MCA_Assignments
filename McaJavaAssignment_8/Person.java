import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    String name ;
    int id;
    String phone;

    Person(){}
    Person( String name,int id,String phone){
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    void getDetails(){
        System.out.println("Enter Student Details : ");
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter ID : ");
        id = sc.nextInt();
        System.out.println("Enter Phone NUmber : ");
        phone = sc.next();
    }

    void displayDetails(){
        System.out.println("Student Details : ");
        System.out.println("Name : "+name+" ID : "+id+" Phone : "+phone);
    }


    public Person(Person Original){
       this.name = Original.name;
       this.id = Original.id;
       this.phone = Original.phone;
       System.out.println("From Copy Constructor ");
    }

    public static void main(String[] args) {
        Person Original = new Person();

        Original.getDetails();
        Original.displayDetails();

        System.out.println("==========================");
        System.out.println("Copy : ");
        Person Copy = new Person(Original);
        Copy.getDetails();
        Copy.displayDetails();
    }
}
