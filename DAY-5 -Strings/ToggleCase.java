// public class ToggleCase {
//     public static void main(String[] args) {
//         String str = "Dell";
        
//         String result = str.toUpperCase();
        
//         System.out.println(result);
//     }
// }




//CHANGE LETTERS
public class ToggleCase {
    public static void main(String[] args) {
        String str = "Dell";
        char[] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if(Character.isLowerCase(ch[i])) {
                ch[i] = Character.toUpperCase(ch[i]);
            } else {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }

        System.out.println(new String(ch));
    }
}