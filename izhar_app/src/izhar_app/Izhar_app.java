
package izhar_app;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Izhar_app {

    
    public static void main(String[] args) {
       
          Scanner input=new Scanner(System.in);
           /* 
          char opr;
          System.out.print("Enter the operator: ");
           opr=input.nextLine().charAt(0);
          System.out.println("Your name is : "+opr);
        
          
             nextInt();
             nextShort();
             nextLong();
             nextFloat();
             nextDouble();
             nextByte();
             nextLine();
          
         
           
           
           int mass;
           double vel;
           double ke;
           System.out.print("Enter the mass : ");
           mass=input.nextInt();
           System.out.print("Enter the velocity : ");
           vel=input.nextDouble();
           ke=(mass*vel*vel)/2;
           System.out.println("K . E : "+ke);
        
      String name;
      name= JOptionPane.showInputDialog("Enter the value of num ");
      JOptionPane.showMessageDialog(null, "Name : "+name);
          */
           
           int num1;
           int num2;
          
           num1=Integer.parseInt(JOptionPane.showInputDialog("Enter the num1 "));
           num2=Integer.parseInt(JOptionPane.showInputDialog("Enter the num2 "));
          
           JOptionPane.showMessageDialog(null, "Sum : "+(num1+num2));
    }
    
}


/* 8 primitive data types:
  char         2 bytes      a , b, #, %, @
  byte         1 byte       3 , 8 , 5
  short        2 byte       12, 67, 87 , 87, 7 
  int          4 bytes      765, 8667, 5787
  long         8 bytes      87678687, 876767687, 75675675
  float        4 bytes      67.98,  87.765 , 45.656
  double       8 bytes      765675675.76576,765675.876786
  boolean       1 bit       true, false
*/