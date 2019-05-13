
package access_specifier_izhar;
import java.util.Scanner;


public class Access_specifier_izhar {

    
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
          Vehicle v1=new Vehicle();
         v1.get("Bus");
          v1.display();
         
       
    }
    
}

class Vehicle{
  private String name;
  
  public void get(String name){
     this.name=name;
  }
   
  public void display(){
     System.out.println("Name : "+name);
   }
}
