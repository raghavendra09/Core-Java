final class Example1
{
 void method1()
 {
  System.out.println("Base class method 1 invoking...");
 }
}
class Example2 extends Example1
{
 
}
class FinalDemo3
{
 public static void main(String args[])
 {
  Example2 ob=new Example2();
  ob.method1();
 }
}