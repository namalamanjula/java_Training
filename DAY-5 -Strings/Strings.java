// import java.util.Scanner;

// public class Strings {
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         String s = "dell";
//         System.out.println(System.identityHashCode(s)); // Fixed space in method name
//         String str = new String(); // Fixed hyphen to equals sign
//         String new_str; // Declared new_str variable
//         new_str = "dell"; // Assigned string literal "dell" to new_str
//         System.out.println(s == str);
//         System.out.println(new_str == str); // Fixed assignment to comparison
//         System.out.println(new_str == s);
//     }
// }

//WITHOUT USING DEFAULT METHOD

class Strings {
    public static void main(String[] args) {
        String S = "Dell";
        String s1 = "";

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                s1 += (char)(ch - 32);
            } else {
                s1 += ch;
            }
        }
        System.out.println(s1);
    }
}



