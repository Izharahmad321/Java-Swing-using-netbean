package Employees;
import java.util.Scanner;


public class Professors {

    Scanner obj = new Scanner(System.in);

    protected String name, f_name, address, contact;
    protected String resignation, f_o_s;             //f_o_s = field_of_specialization;
    protected Long salary;
    protected int age;

  protected void input() {

        System.out.print("Please Enter Your Name :");
        name = obj.nextLine();
        System.out.print("Please Enter Your father Name :");
        f_name = obj.nextLine();
        System.out.print("Please Enter Your Address :");
        address = obj.nextLine();
        System.out.print("Please Enter Your Contact :");
        contact = obj.nextLine();
        System.out.print("Please Enter Your Name :");
        resignation = obj.nextLine();
        System.out.print("Please Enter Your father Name :");
        f_o_s = obj.nextLine();
        System.out.print("Please Enter Your Address :");
        age = obj.nextInt();

    }
}

class Teachers extends Professors {

    protected void output_teach() {
        input();
        System.out.println("Name :" + name);
        System.out.println("Father Name :" + f_name);
        System.out.println("Address :" + address);
        System.out.println("Contact No :" + contact);
        System.out.println("Resignation :" + resignation);
        System.out.println("Specialization :" + f_o_s);
        System.out.println("Salary :" + salary);
        System.out.println("Age :" + age);
    }
}
