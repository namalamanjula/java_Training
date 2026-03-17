
// class Bitwise {
//     public static void main(String args[]) {
//         int num1 = Sc.nextInt();
//         int num2 = Sc.nextInt();
//         Sc.nextLine();
//         String op = Sc.nextLine();

//         if (op.equals("AND")) {
//             System.out.println(num1 & num2);
//         } else if (op.equals("OR")) {
//             System.out.println(num1 | num2);
//         } else if (op.equals("XOR")) {
//             System.out.println(num1 ^ num2);
//         } else if (op.equals("NAND")) {
//             System.out.println(~(num1 & num2));
//         }
//     }
//  }


import java.util.Scanner;

public class Bitwise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a score (0-100):");
        int score = sc.nextInt();
        
        char grade = (score >= 90) ? 'A' :
                     (score >= 80) ? 'B' :
                     (score >= 70) ? 'C' :
                     (score >= 60) ? 'D' : 'F';
        
        System.out.println("Grade: " + grade);
        sc.close();
    }
}