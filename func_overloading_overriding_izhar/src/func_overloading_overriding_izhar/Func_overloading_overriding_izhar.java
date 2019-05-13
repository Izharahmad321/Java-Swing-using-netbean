
package func_overloading_overriding_izhar;
import java.util.Scanner;

public class Func_overloading_overriding_izhar {

   
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
//        Test t1=new Test();
//        t1.myfunc();
//        t1.myfunc(5);
//        t1.myfunc("My function", 20);
//        t1.myfunc(50, "last function");
//        t1.myfunc("This is functions");

   B objj= new B();
   objj.display();
       
    }
    
}

//class Test{
//      Scanner obj=new Scanner(System.in);
//    int num;
//   
//    void myfunc(){
//      System.out.print("Enter the number : ");
//      num=obj.nextInt();
//        System.out.println("Num : "+num);
//    }
//    
//    void myfunc(int x){
//       num=x;
//       System.out.println("Num : "+num);
//    }
//    
//    void myfunc(int x,String msg){
//       num=x;
//       System.out.println("Num : "+num);
//       System.out.println(msg);
//       
//    }
//    
//     void myfunc(String msg,int x){
//       num=x;
//       System.out.println("Num : "+num);
//       System.out.println(msg);
//       
//    }
//     
//     void myfunc(String msg){
//         System.out.println(msg);
//     }
//    
//}


class A{
   void display(){
     System.out.println("THis is function of class A");
   }
}

class B extends A{
  void display(){
     System.out.println("THis is function of class B");
  }
}