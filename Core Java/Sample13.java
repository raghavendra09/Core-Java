class ThisDemo2
{
 int a,b;
 ThisDemo2()
 {
  System.out.println("Default Constructor.........");
 }
 ThisDemo2(int x)
 {
  this();
  a=x;
  System.out.println("Parametarized Constructor.........");
 }
 ThisDemo2(int x,int y)
 {
  this(x);
  a=x;
  b=y;
  System.out.println("Parametarized Constructor passing 2 args");
 }
}
class Sample13
{
 public static void main(String args[])
 {
  ThisDemo2 ob=new ThisDemo2(100,200);
 }
}