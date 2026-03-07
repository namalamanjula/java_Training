//Revers 
// class Recursion{
//     void rec(int num){
//         if(num>10){
//             return;
//         }
//         rec(num+1);
//         System.out.println(num);
//     }
//     public static void main(String[] args) {
//         Recursion ob=new Recursion();
//             ob.rec(1);
//         }
//     }



// FIBONACI SERIES
//  class Recursion{
//     int rec(int num){
//         if(num<=1){
//             return num;
//         }
//         return rec(num-1)+rec(num-2);
//         }
//         public static void main(String[] args){
//             Recursion ob=new Recursion();
//             for (int i=0;i<10;i++)
//             System.out.println(ob.rec(i));
                
//             }
//         }



//INDIRECT RECURSION
//class Recursion{
   // void recA(int num){
   //     if(num>10){
    //         return ;
    //     }
    //     System.out.println(num);
    //     recB(num+1);
    // }
    // void recB(int num){
    //     if(num>10){
    //         return;
    //     }
    //    // System.out.println(num);
    //     recA(num+1);
    // }
    // public static void main(String[] args)
    // {
    //     Recursion ob=new Recursion();
    //     ob.recA(1);
    //     }
    //     }


    //SUM OF NATURAL NUMBERS
 class Recursion {
    int rec(int num) {
        if(num==1) {
            return 1;
        }
        return num+rec(num-1);
    }
    public static void main(String[] args) {
        Recursion ob = new Recursion();
        System.out.println(ob.rec(10));
    }
}