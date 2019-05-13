
package control_struct_izhar;
import java.util.Scanner;


public class Control_struct_izhar {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       /*
        
        if  
        if else
        multiple if else 
        nested if else 
        switch
        
        loops
        
        */
//       
//      int num=-9;
//      if(num>0){
//        System.out.println("This is maxtech institute");
//        System.out.println("Ok thanks....");
//        
//      }
//      
//      System.out.println("This is statement outside if statement....");
       
//        if(testing condition){
//    
//    }else{
//            
//            }

//int num;
//System.out.print("Enter the num to check wether it is +ive or -ive : ");
//     num=input.nextInt();
//     if(num>0){
//         System.out.println("The number is positive number ");
//     }else{
//       System.out.println("The number is negative number");
//     }
//    
//       System.out.println("This is statement outside if else ...");
//    }

//     if(testing condition){
//     
//     }else if(testing condition){
//             
//             }else if(){
//                     
//                     }else{
//                     
//                     }

//        int num;
//        System.out.print("Enter the number : ");
//        num=input.nextInt();
//        if(num>0){
//          System.out.println("The number is positive...");
//        }else if(num<0){
//          System.out.println("The number is negative...");
//        }else{
//          System.out.println("The number is zero...");
//        }
//        
//        System.out.println("THis is statement outside if else ...");

//  
//              int month_num;
//              System.out.print("Enter the month number : ");
//              month_num=input.nextInt();
//              if(month_num>=1 && month_num<=3){
//                System.out.println("This is winter season...");
//              }else if(month_num==4 || month_num==5 || month_num==6){
//                  System.out.println("This is spring season...");
//              }else if(month_num>=7 && month_num<=9){
//                  System.out.println("This is Summer season...");
//              }else if(month_num>=10 && month_num<=12){
//               System.out.println("This is autmn season...");                  
//              }else{
//                System.out.println("Sorry you enter an invalid month number ...");
//              }


//            if(testing condition){
//                   if(){
//                   
//                   }else{
//                     if(){
//                     
//                     }else{
//                     
//                     }
//                   }
//            }else{
//                   if(){
//                    
//                    }else{
//                    
//                    } 
//                    }

//  int num1,num2,num3;
//  System.out.print("Enter the value of num 1 : ");
//  num1=input.nextInt();
//  System.out.print("Enter the value of num 2 : ");
//  num2=input.nextInt();
//  System.out.print("Enter the value of num 3 : ");
//  num3=input.nextInt();
//  
//       if(num1<num2){
//            if(num1<num3){
//               System.out.println("Smallest number : "+num1);  
//            }else{
//              System.out.println("Smallest number : "+num3);
//            }
//       }else{
//           
//           if(num2<num3){
//              System.out.println("Smallest number : "+num2);
//           }else{
//              System.out.println("Smallest number : "+num3);
//           }
//         
//       }

   /*
   
     switch(testing condition){  //  numbers, variable ,  arithmatic expression
     
case 0:
     statements;
        break;

case 1:
    statements;
     break;

case 2:
   statements;
    break;

default:
   statement;
}

*/
      
   
      
//     switch("izhar"){
//         case "ali":
//             System.out.println("Hi ali");
//              break;
//             
//          case "sajid":
//             System.out.println("Hi sajid");
//             break;
//             
//           case "izhar":
//             System.out.println("Hi Izhar....");
//              break;
//             
//           default:
//             System.out.println("This is default case");
//             
//     }
//     
//     System.out.println("This is statement outside switch ...");
//   

      int num1,num2;
      char opr;
      System.out.print("Enter the num1 : ");
      num1=input.nextInt();
        System.out.print("Enter the num2 : ");
      num2=input.nextInt();
      System.out.print("Enter the arithmatic operator : ");
      opr=input.next().charAt(0);
      switch(opr){
          case '+':
              System.out.println(num1+" + "+num2+ " = "+ (num1+num2));
              break;
              
          case '-':
               System.out.println(num1+" - "+num2+ " = "+ (num1-num2));
              break;
              
          case '*':
               System.out.println(num1+" x "+num2+ " = "+ (num1*num2));
              break;
            
          case '/':
               System.out.println(num1+" / "+num2+ " = "+ (num1/num2));
              break;
           
          case '%':
               System.out.println(num1+" % "+num2+ " = "+ (num1%num2));
              break;
              
          default:
              System.out.println("Sorry! you enter an invalid arithematic operator...");
      }
      
   
   

    }
    
}
