import java.util.Scanner;

class Nested {

    class Test {
        void display(int n) {
            System.out.println("Number entered: " + n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Nested ob = new Nested();
        Nested.Test obj = ob.new Test();

        obj.display(n);
    }
}