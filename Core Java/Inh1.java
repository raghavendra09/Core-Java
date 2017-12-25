class Base
{
 protected int x,y;
 void display()
 {
  System.out.println("x : "+x+"\ty : "+y);
 }
}
class Derived extends Base
{
 void setdata()
 {
  x=10;
  y=20;
 }
}
class Inh1
{
 public static void main(String args[])
 {
  Derived ob=new Derived();
  ob.setdata();
  ob.display();
 }
}