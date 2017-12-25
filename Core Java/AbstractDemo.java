import java.util.*;
abstract class Shape
{
 double area;
 Scanner sc=new Scanner(System.in);
 void show()
 {
  System.out.println("Area is:"+area);
 }
 abstract void FindArea();
}
class Circle extends Shape
{
 int r;
 final double pi=3.14;
 void FindArea()
 {
  System.out.println("enter radius is:");
  r=sc.nextInt();
  area=pi*r*r;
  show();
 }
}
class Triangle extends Shape
{
 int b,h;
 void FindArea()
 {
  System.out.println("enter Base & Height:");
  b=sc.nextInt();
  h=sc.nextInt();
  area=0.5*b*h;
  show();
 }
}
class AbstractDemo
{
 public static void main(String args[])
 {
  Shape ob;
  System.out.println("Abstract class reference varaiable refers circle class:");
  Circle c=new Circle();
  Triangle t=new Triangle();
  c.FindArea();
  t.FindArea(); 
 }
}