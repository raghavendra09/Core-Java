class Demo
{
 Demo()
 {
  System.out.println("Base class constructor........");
 }
}
class Demo2 extends Demo
{
 Demo2()
 {
  super();
  System.out.println("Derive class constructo........");
 }
}
class Inh5
{
 public static void main(String args[])
 {
  Demo2 ob=new Demo2();
 }
}