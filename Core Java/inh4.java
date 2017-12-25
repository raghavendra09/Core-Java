class A
{
 int i;
}
class B extends A
{
 int i;
 B(int x,int y)
 {
  super.i=x;
  i=y;
 }
 void show()
 {
  System.out.println("Base i:"+super.i+"\tDerived i:"+i);
 }
}
class Inh4
{
 public static void main(String args[])
 {
  B ob=new B(10,50);
  ob.show();
 }
}