
package arraylist_izhar;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_izhar {

    
    public static void main(String[] args) {
          ArrayList al=new ArrayList();
          Student s1=new Student();
          Student s2=new Student();
          Student s3=new Student();
            s1.input();
            s2.input();
            s3.input();
         al.add(s1);
         al.add(s2);
          al.add(s3);
          
          if(al.isEmpty()){
            System.out.println("Array list is empty...");
          }else{
              
                for(int i=0;i<al.size();i++){
           Student temp= (Student)al.get(i);
           temp.output();
          }
    }
    
}
}
class Student{
    Scanner in=new Scanner(System.in);
   String name;
   int marks;
   
   void input(){
      System.out.print("Enter the name : ");
      name=in.nextLine();
      System.out.print("Enter the marks : ");
      marks=in.nextInt();
   }
   
   
   void output(){
   
     System.out.println("Name : "+name);
     System.out.println("Marks : "+marks);
   }
}
