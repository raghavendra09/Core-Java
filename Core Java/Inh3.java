class Baseclass
{
 void show()
 {
  System.out.println("Base class show()");
 }
 void disp()
 {
  System.out.println("Base class Disp()");
 }
}
class D extends Baseclass
{
 void show()
 {
  super.show();
  System.out.println("Derived class show()");
 }
 void disp()
 {
  super.disp();
  System.out.println("Derived class Disp()");
 }
}
class Inh3
{
 public static void main(String args[])
 {
   D d=new D();
   d.show();
   d.disp();
 }
}