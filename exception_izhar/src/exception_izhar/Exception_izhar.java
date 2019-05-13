package exception_izhar;

public class Exception_izhar {

    public static void main(String[] args) {

        int x = 10;

        int array[]=new int[3];
       
        try {
           
           array[2]=20;
           System.out.println(x);
        }catch(Exception ex){
            System.out.println("Exception has been occured "+ex);
        }finally{
           System.out.println("This is finally statement...");
        }

        System.out.println("Hello khan");
        System.out.println("Hello khan");
        System.out.println("Hello khan");
        System.out.println("Hello khan");
        System.out.println("Hello khan");

    }

}
