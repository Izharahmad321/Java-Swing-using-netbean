package class_izhar;
import java.util.Scanner;


public class Class_izhar {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
         Box b1=new Box();
         b1.get_data();
         b1.start();
         b1.set_data();
         b1.end();
        
        
        
    }
    
}

class Box{
    
    Scanner input=new Scanner(System.in);
    
      int length;
      int width;
      int height;
      long area,volume;
      
      void get_data(){
           System.out.println("Enter the lenght : ");
           length=input.nextInt();
            System.out.println("Enter the width : ");
           width=input.nextInt();
            System.out.println("Enter the height : ");
           height=input.nextInt();
      }
      
         long get_area(){
         area=length*width;
         return area;
  
      }
      
       long get_volume(){
       volume= length*width*height;
       return volume;

      }   
      
      void set_data(){
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
        System.out.println("Height : "+height);      
        System.out.println("Area of the box : "+get_area());
        System.out.println("Volume of the box : "+get_volume());
      }
      
   
      
      void start(){
        System.out.println("**************** START *******************");
      }
      
      void end(){
        System.out.println("**************** END *******************");
      }
      
}



