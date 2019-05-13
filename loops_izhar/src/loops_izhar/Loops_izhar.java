
package loops_izhar;
import java.util.Scanner;


public class Loops_izhar {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      
        
        /*
          TYPES of loop:
             for loop
             while loop
             do while loop
        
        
          for(initialization;condition;increment/decrement){
            loop statements;
        }
        
        
        */
//        
//        int tab_num;
//        System.out.print("Enter the table number to print : ");
//        tab_num=input.nextInt();
//        for(int i=1;i<=20;i++){
//          System.out.println(tab_num+" x "+ i + " = "+ (tab_num*i));
//        }

//     int temp=0;
//      for(int i=1;i<=10;i++){
//         temp= temp+i; 
//      }
//      
//      System.out.println("sum from 1 to 10 : "+ temp);

//      int num;
//      System.out.print("Enter the number to find its factorial : ");
//      num=input.nextInt();
//      int fact=1;
//      for(int i=1;i<=num;i++){
//         fact=fact*i;
      
/*                  1=1 * 1
                    2 =1 * 2
                    6 =2 * 3
                    24 =6 * 4
                   220=24 * 5
                   720=220 * 6
eg: num=6
                    6!5!4!3!2!1! = 720
                    30*4!
                    120*3!
                    360*2!
                    720*1!
                                  =(720)
*/

//      }
//      
//      System.out.println(num +"! : "+fact);
    
       /*

           initialization;
         while(testing condition){
          statements;
    inc/dec;
}
*/

//          int i=1;
//          while(i<=5){
//            System.out.println("Max Tech computer institute"+i);
//            i++;
//              
//          }
//    


/*
    initialization;
         do{

 statements;
inc/dec;

     }while(testing condition);
   
*/

  int i=1;

       do{
           System.out.println("Max Tech computer institute"+i);
           i++;
       }while(i<0);

    


}
}