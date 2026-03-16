//1D Array
// public class arrays {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 40, 50};

//         for(int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }


//2D array
public class arrays {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}