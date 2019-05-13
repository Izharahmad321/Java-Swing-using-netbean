
package function_izhar;
import java.util.Scanner;
import javafx.scene.shape.StrokeLineCap;


public class Function_izhar {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int num;
        System.out.print("Enter the numbers to find the square : ");
        num=input.nextInt();
            int temp= square(num);
            display(num,temp);
            System.out.println("THis is my function program...");
     
        
       
    }
    
     static  int square(int x){
          return x*x;
       }
     
     static void display(int x,int ans){
         System.out.println("Square of "+x+" = "+ans);
     }
    
    
}
