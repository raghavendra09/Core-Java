class OverloadDemo
{
 int x,y,z,s;
 void add()
 {
  x=10;
  y=20;
  z=30;
  s=x+y+z;
  System.out.println("sum without passing args: "+x+"+"+y+"+"+z+"="+s);
 }
 void add(int a)
 {
  x=a;
  y=2;
  z=3;
  s=x+y+z;
  System.out.println("sum of passing 1 args: "+x+"+"+y+"+"+z+"="+s);
 }
 void add(int a,int b)
 {
  x=a;
  y=b;
  z=5;
  s=x+y+z;
  System.out.println("sum of passing 2 args: "+x+"+"+y+"+"+z+"="+s);
 }
 void add(int a,int b,int c)
 {
  x=a;
  y=b;
  z=c;
  s=x+y+z;
  System.out.println("sum of passing 3 args: "+x+"+"+y+"+"+z+"="+s);
 }
}
class Sample11
{
 public static void main(String args[])
 {
  OverloadDemo ob=new OverloadDemo();
  ob.add();
  ob.add(8);
  ob.add(8,1);
  ob.add(5,5,5);
 }
}