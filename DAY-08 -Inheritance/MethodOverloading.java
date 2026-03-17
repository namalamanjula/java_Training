
class Shape{ void draw(){System.out.println("Shape");} }
class Circle extends Shape{ void draw(){System.out.println("Circle");} }
public class MethodOverriding{
 public static void main(String[] args){
  Shape s=new Circle();
  s.draw();
 }
}
