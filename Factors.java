public class Factors{
    public static void main(String[] args){
         Scanner Sc =new Scanner(System.in);
         int n=Sc.nextInt();
         for(int i=1;i<n;i++) {
            if(n%1==0){
                System.out.println(i);
            }
         }
     }
  }