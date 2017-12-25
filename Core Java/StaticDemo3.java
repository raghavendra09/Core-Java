class StaticDemo3
{
 static int x;
 void show()
 {
  x++;
  System.out.println("Static x is:"+x);
 }
 public static void main(String args[])
 {
  int i;
  StaticDemo3 ob=new StaticDemo3();
  for(i=0;i<10;i++)
  {
   ob.show();
  }
 }
}