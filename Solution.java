// // // kuick.io
// // // shortcut for sharing
// // // Toggle theme


// // class Solution {
// //     char data;
// //     Solution link;
// //     Solution head;

// //         void push(char c){
// //             Solution newNode = new Solution();
// //             newNode.data=c;
// //             if(head==null){
// //                 head=newNode;
// //             }else{
// //                 newNode.link=head;
// //                 head=newNode;
// //             }
// //         }
// //         void pop(){
// //             if(!isEmpty()){
// //                 head=head.link;
// //             }
// //         }
// //         char peek(){
// //                 if(!isEmpty()){
// //                 return head.data;
// //             }
// //             return '*';
// //         }
// //         boolean isEmpty(){
// //             return head==null;
// //         }
// //     public boolean isValid(String s) {
// //         Solution ob = new Solution();
// //         for(int i=0;i<s.length();i++){
// //             char ch = s.charAt(i);
// //             if(ch=='(' || ch =='[' || ch == '{'){
// //                 ob.push(ch);
// //             }else{
// //                 if(ob.isEmpty()){
// //                     return false;
// //                 }
// //                 if((ch==')' && ob.peek()!= '(') ||
// //                 (ch==']' && ob.peek()!='[')  ||
// //                 (ch=='}' && ob.peek()!='{')  ){
// //                     return false;
// //                 }
// //                 ob.pop();
// //             }
// //         }
// //         return ob.isEmpty();
// //     }
// // }


// class Solution {

//     char data;
//     Solution link;
//     Solution head;

//     // Push operation
//     void push(char c) {
//         Solution newNode = new Solution();
//         newNode.data = c;

//         if (head == null) {
//             head = newNode;
//         } else {
//             newNode.link = head;
//             head = newNode;
//         }
//     }

//     // Pop operation
//     void pop() {
//         if (!isEmpty()) {
//             head = head.link;
//         }
//     }

//     // Peek operation
//     char peek() {
//         if (!isEmpty()) {
//             return head.data;
//         }
//         return '*';
//     }

//     // Check if stack is empty
//     boolean isEmpty() {
//         return head == null;
//     }

//     // Valid Parentheses Logic
//     public boolean isValid(String s) {
//         Solution ob = new Solution();

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (ch == '(' || ch == '[' || ch == '{') {
//                 ob.push(ch);
//             } else {
//                 if (ob.isEmpty()) {
//                     return false;
//                 }

//                 if ((ch == ')' && ob.peek() != '(') ||
//                     (ch == ']' && ob.peek() != '[') ||
//                     (ch == '}' && ob.peek() != '{')) {
//                     return false;
//                 }

//                 ob.pop();
//             }
//         }

//         return ob.isEmpty();
//     }

//     // Main method to run program
//     public static void main(String[] args) {

//         Solution sol = new Solution();

//         String input1 = "({[]})";
//         String input2 = "([)]";
//         String input3 = "(";

//         System.out.println(input1 + " -> " + sol.isValid(input1));
//         System.out.println(input2 + " -> " + sol.isValid(input2));
//         System.out.println(input3 + " -> " + sol.isValid(input3));
//     }
// }                                                                                                








//class Solution{
//     int rec(int num){
//         if(num==1){
//             return 1;
//             }
//             return num*rec(num-1);
//     }
//     public static void main(String[] args)
//     {
//         Solution ob=new Solution();
//         System.out.println(ob.rec(5));
//     }
// }


