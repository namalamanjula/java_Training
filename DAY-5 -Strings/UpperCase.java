// UPPER CASE LETTERS
// public class UpperCase {
//     public static void main(String[] args) {
//         char[] arr = {'A', 'B', 'C', 'D', 'E'};

//         for(int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }


//UPPER CASE WORDS
// public class UpperCase {
//     public static void main(String[] args) {
//         String[] arr = {"APPLE", "BALL", "CAT"};

//         for(String s : arr) {
//             System.out.println(s);
//         }
//     }
// }




//LOWER CASE TO UPPER CASE
public class UpperCase {
    public static void main(String[] args) {
        String[] arr = {"apple", "ball", "cat"};

        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toUpperCase();
            System.out.println(arr[i]);
        }
    }
}