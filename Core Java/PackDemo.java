import mypack.*;
class PackDemo
{
 public static void main(String args[])
 {
  Cls1 ob1=new Cls1();
  Cls2 ob2=new Cls2();
  ob1.meth1();
  ob1.meth2();
  ob2.setdata(10,5);
  ob2.show();
  System.out.println("Square of 5 is: "+ob2.square(5));
  System.out.println("Cube of 10 is: "+ob2.cube(10));
 }
}