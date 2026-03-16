
class Rectangle{
 int l,b;
 int area(){ return l*b; }
}
public class RectangleClass{
 public static void main(String[] args){
  Rectangle r=new Rectangle();
  r.l=5; r.b=4;
  System.out.println(r.area());
 }
}
