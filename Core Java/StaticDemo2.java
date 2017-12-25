class StaticDemo2
{
 static int x,y;
 static void show()
 {
  x=10;
  y=20;
  System.out.println("show method()....");
  System.out.println("x:"+x+"\ty:"+y);
 }
 public static void main(String args[])
 {
  StaticDemo2.show();
  StaticDemo2 ob=new StaticDemo2();
  ob.show();
 }

}