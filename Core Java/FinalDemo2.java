class Example1
{
 /*final void method()
   {
    System.out.println("Base class method 1 invoking...");
   }*/
}
class Example2 extends Example1
{
 void method1()
 {
  System.out.println("Derive class methd 1 invoking...");
 }
}
class FinalDemo2
{
 public static void main(String args[])
 {
  Example2 ob=new Example2();
  ob.method1();
 }
}