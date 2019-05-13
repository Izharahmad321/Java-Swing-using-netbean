
package abstractclass_interface_izhar;
import java.util.Scanner;


public class Abstractclass_interface_izhar {

    
    public static void main(String[] args) {
        
              Test.diplay();
       Test.output();
        
//          B obj=new B();
//          obj.myfunc();
//          obj.display();
//          obj.output();
      
//    Employee emp1=new Employee();
//    emp1.input();
//    emp1.salary_cal();
//    emp1.output();

    }
    
}

//abstract class A{
//     abstract void display();
//     
//     void output(){
//        System.out.println("Hello khan");
//     }
//}
//
//
//class B extends A{
//   void myfunc(){
//     System.out.println("This is my function....");
//   }
//
//   
//    void display() {
//        System.out.println("THis is abstract class display method...");
//    }
//}


//interface IEmployee{
//     abstract void input();
//     abstract void output();
//     abstract void salary_cal();
//     
//}
//
//class Employee implements IEmployee{
//    Scanner objj=new Scanner(System.in);
//      String name;
//      String address;
//      String contact;
//      int ssalry;
//
//   
//    public void input() {
//          System.out.print("Enter the name : ");
//          name=objj.nextLine();
//          System.out.print("Enter the address : ");
//          address=objj.nextLine();
//          System.out.print("Enter the contact : ");
//          contact=objj.nextLine();
//        
//        
//    }
//
//    
//    public void output() {
//         System.out.println("Name : "+name); 
//         System.out.println("Address : "+address); 
//         System.out.println("Contact : "+contact); 
//         System.out.println("Salary : "+ssalry); 
//    }
//
//   
//    public void salary_cal() {
//          System.out.print("Enter the net salary : ");
//        ssalry=objj.nextInt();
//    }
//
//}


class Test{
   static void output(){
      System.out.println("Hello this is static method");
    }
    
   static void diplay(){
     System.out.println("Hello this is non static method...");
    }
}
