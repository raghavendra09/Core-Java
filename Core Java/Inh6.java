interface i1
{
 void m1();
 void m2();
}
interface i2
{
 void m3();
}
interface i3
{
 void hello();
}
class ImplementDemo implements i3
{
 public void m1()
 {
  System.out.println("method 1 invoked....");
 }
 public void m2()
 {
  System.out.println("method 2 invoked....");
 }
 public void m3()
 {
  System.out.println("method 3 invoked....");
 }
 public void hello()
 {
  System.out.println("This is Hello");
 }
}
class Inh6
{
 public static void main(String args[])
 {
  ImplementDemo ob=new ImplementDemo();
  ob.m1();
  ob.m2();
  ob.m3();
  ob.hello();
 }
}