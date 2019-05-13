package class_izhar;
import java.util.Scanner;


public class Class_izhar {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        Student std1=new Student();
        Student std2=new Student();
        std1.inputt();
        std2.inputt();
        std1.start();
        std1.output();
        std1.end();
        System.out.println("\n");
        std2.start();
        std2.output();
        std2.end();
        
        
        
    }
    
}


class Student{
    Scanner input=new Scanner(System.in);
   String name;
   int marks;
   String grade;
   
   void inputt(){
     System.out.print("Enter the student name : ");
     name=input.nextLine();
     System.out.print("Enter the marks : ");
     marks=input.nextInt();
     System.out.print("Enter the grade : ");
     grade=input.nextLine();
     grade=input.nextLine();
   }
   
   void output(){
      System.out.println("Name : "+name);
      System.out.println("Marks : "+marks);
      System.out.println("Grade : "+grade);
   }
   
   void start(){
     System.out.println("***********************  Record Start **************************");
   }
   
   void end(){
     System.out.println("***********************  Record END **************************");
   }
   
}



