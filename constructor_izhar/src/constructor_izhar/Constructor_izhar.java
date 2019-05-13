package constructor_izhar;

import java.util.Scanner;

public class Constructor_izhar {

    public static void main(String[] args) {
        Test obj = new Test();
        obj.show();

    }

}

class Test {

    Scanner obj = new Scanner(System.in);
    String name;
    int marks;

    Test() {
        name = "Izhar";
        marks = 765;
    }

    Test(String n) {
        name = n;
        marks = 754;
    }

    Test(int m) {
        name = "sajid";
        marks = m;
    }

    Test(String n, int m) {
        name = n;
        marks = m;
    }

    Test(int m, String n) {
        marks = m;
        name = n;
    }

    void show() {
        System.out.println("Name : " + name);
        System.out.println("Marks  : " + marks);
    }
}
