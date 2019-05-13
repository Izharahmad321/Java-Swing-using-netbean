
package array_izhar;
import java.util.Scanner;


public class Array_izhar {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
      //  datataype array_name[]=new datatype[size];
//             int marks[]=new int[5];
//             
//             for(int i=0;i<marks.length;i++){
//               System.out.print("Enter the marks["+i+"] : ");
//               marks[i]=input.nextInt();
//             }
//             
//             for(int j=0;j<marks.length;j++){
//                System.out.println("marks["+j+"] : "+marks[j]);
//             }
             
//          marks[0]=56;
//          marks[1]=78;
//          marks[2]=44;
//          marks[3]=89;
//          marks[4]=77;

 // int marks[]={20,30,40,50,60};
//          
//          System.out.println("marks[0] : "+marks[0]);
//          System.out.println("marks[1] : "+marks[1]);
//          System.out.println("marks[2] : "+marks[2]);
//          System.out.println("marks[3] : "+marks[3]);
//          System.out.println("marks[4] : "+marks[4]);

/*
        int arr1[]={10,20,30,40,50};
        int arr2[]={10,20,30,40,50};
        int sum[]=new int[5];
        
        for(int i=0;i<sum.length;i++){
           sum[i]= arr1[i]+arr2[i];
        }
        
        
        System.out.println("Array 1 : ");
        for(int i=0;i<arr1.length;i++){
              System.out.print(arr1[i]+"\t");
        }
        System.out.println("\n");
           System.out.println("Array 2 : ");
        for(int i=0;i<arr2.length;i++){
              System.out.print(arr2[i]+"\t");
        }
        
         System.out.println("\n");        
           System.out.println("Sum of Array 1 and Array 2 : ");
        for(int i=0;i<sum.length;i++){
              System.out.print(sum[i]+"\t");
        }
*/
 
       
           //  datatype arrayname[][]=new datatype[rows][cols];
         
//         int matrix[][]=new int[2][3];
//         
//           for(int row=0;row<matrix.length;row++){
//                 for(int col=0;col<matrix[row].length;col++){
//                    System.out.print("Enter the value of matrix["+row+"]["+col+"] : ");
//                    matrix[row][col]=input.nextInt();
//                 }
//           
//           }
//           
//             for(int row=0;row<matrix.length;row++){
//                 for(int col=0;col<matrix[row].length;col++){
//                   System.out.print(matrix[row][col]+"\t");
//                 }
//                 System.out.print("\n");
//           
//           }


          int array1[][]={{2,3,4},{5,6,7},{8,9,3}};
          int array2[][]={{5,6,7},{2,3,4},{1,5,7}};
          int sum[][]=new int[3][3];
          
            for(int i=0;i<sum.length;i++){
               for(int j=0;j<sum[i].length;j++){
                  sum[i][j]=array1[i][j]+array2[i][j];
               }
            }
            
            System.out.println("Array 1 :");
             for(int i=0;i<array1.length;i++){
               for(int j=0;j<array1[i].length;j++){
                  System.out.print(array1[i][j]+"\t");
               }
               System.out.print("\n");
            }
             System.out.print("\n");
             System.out.println("Array 2 :");
             for(int i=0;i<array2.length;i++){
               for(int j=0;j<array2[i].length;j++){
                  System.out.print(array2[i][j]+"\t");
               }
               System.out.print("\n");
            }
             System.out.print("\n");
               System.out.println("Sum of array 1 and array 2 :");
             for(int i=0;i<sum.length;i++){
               for(int j=0;j<sum[i].length;j++){
                  System.out.print(sum[i][j]+"\t");
               }
               System.out.print("\n");
            }
           
           
//            matrix[0][0]=3;
//            matrix[0][1]=6;
//            matrix[1][0]=8;
//            matrix[1][1]=9;
//         
//            
//            
//            System.out.print(matrix[0][0]+"\t");
//            System.out.print(matrix[0][1]+"\n");
//            System.out.print(matrix[1][0]+"\t");
//            System.out.print(matrix[1][1]+"\n");

      

      
    }
    
}
