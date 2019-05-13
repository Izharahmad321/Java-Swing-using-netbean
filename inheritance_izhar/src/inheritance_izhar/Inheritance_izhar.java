
package inheritance_izhar;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Inheritance_izhar {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        GreenFruits gf=new GreenFruits();
        gf.display();
        
       Fruits f1=new Fruits();
       f1.inputtt();
//             Student std1=new Student();  
//             Employee emp1=new Employee();
//             std1.inputStudent();           
//             std1.outputStudent();
//             emp1.inputEmployee();
//             emp1.outputEmployee();
           
        
        
        
//        A obj1=new A();
//        obj1.x=10;
//        obj1.output();
//        obj1.y=20;
//        obj1.display();

//       B obj2=new B();
//      
//       obj2.display(40,60);
//      
    
        
       
    }
    
}

class Fruits{
  protected String name;
  protected void input(){
      name=JOptionPane.showInputDialog("Enter the fruit name : ");
  }
    protected void inputtt(){
        System.out.print("khan");
    }
  }


class GreenFruits extends Fruits{
   void display(){
       input();
       JOptionPane.showMessageDialog(null, "Fruits name : "+name);
   }
}

///////////////////////////////////////////////////////////////////////////////////

//class A{
//    private int x;
////    private void inputt(int a){
////        x=a;
////    }
//    
//    void output(int a){
//       x=a;
//       System.out.println("x = "+x);
//    }
//
//}
//
//class B extends A{
//   private int y;
//   void display(int b,int c){
//       output(b);
//       y=c;
//     System.out.println("y = "+y);
//   }
//}
//
//


//class Info{
//    Scanner input=new Scanner(System.in);
//    
//    int id;
//    String name;
//    String address;
//    
//    void inputInfo(){
//        System.out.print("Enter the ID : ");
//        id=input.nextInt();
//        System.out.print("Enter the Name : ");
//        name=input.nextLine();
//        name=input.nextLine();
//        System.out.print("Enter the address : ");
//        address=input.nextLine();
//    }
//    
//    void outputInfo(){
//       System.out.println("ID : "+id);
//       System.out.println("Name : "+name);
//       System.out.println("Address : "+address);
//    }
//  
//}
//
//class Student extends Info{
//     Scanner input=new Scanner(System.in);
//    int marks;
//    double gpa;
//    void inputStudent(){
//        inputInfo();
//      System.out.print("Enter the student marks : ");
//      marks=input.nextInt();
//      System.out.print("Enter the student gpa : ");
//      gpa=input.nextDouble();
//    }
//    
//    void outputStudent(){
//        outputInfo();
//      System.out.println("Student Marks : "+marks);
//      System.out.println("Student GPA : "+gpa);
//    }
//
//}
//
//class Employee extends Info{
//    Scanner input=new Scanner(System.in);
//    long salary;
//    String desig;
//    
//    void inputEmployee(){
//        inputInfo();
//      System.out.print("Enter the Employee salary : ");
//      salary=input.nextLong();
//      System.out.print("Enter the Employee designation : ");
//      desig=input.nextLine();
//      desig=input.nextLine();
//    
//    }
//    
//    void outputEmployee(){
//        outputInfo();
//      System.out.println("Employee salary : "+salary);
//      System.out.println("Employee designation : "+desig);
//    }
//    
//     
//}