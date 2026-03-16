
class A{
 A(){ System.out.println("Parent"); }
}
class B extends A{
 B(){
  super();
  System.out.println("Child");
 }
}
public class SuperKeywordDemo{
 public static void main(String[] args){
  new B();
 }
}
