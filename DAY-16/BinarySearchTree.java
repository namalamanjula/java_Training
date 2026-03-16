
class Node{
 int data; Node left,right;
 Node(int d){data=d;}
}
public class BSTInsert{
 static Node insert(Node root,int val){
  if(root==null) return new Node(val);
  if(val<root.data) root.left=insert(root.left,val);
  else root.right=insert(root.right,val);
  return root;
 }
 public static void main(String[] args){
  Node root=null;
  root=insert(root,5);
  root=insert(root,3);
  root=insert(root,7);
  System.out.println("Inserted");
 }
}
