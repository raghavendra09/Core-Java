class ConDemo
{
 int x,y;
 ConDemo()
 {
  x=100;
  y=200;
  System.out.println("Non-Parametarized constructor called.....");
 }
 ConDemo(int a,int b)
 {
  x=a;
  y=b;
  System.out.println("Parametarized constructor called.....");
 }
 void display()
 {
  System.out.println("x: "+x+"\t y: "+y);
 }
}
class Sample9
{
 public static void main(String args[])
 {
  ConDemo ob1=new ConDemo();
  ob1.display();
  ConDemo ob2=new ConDemo(111,555);
  ob2.display();
 }
}