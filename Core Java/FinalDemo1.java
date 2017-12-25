class FinalDemo1
{
 final int x=100;
 void show()
 {
  System.out.println("x vlaue is:"+x);
 }
 void change()
 {
  //x=10;
 }
 public static void main(String args[])
 {
  FinalDemo1 ob=new FinalDemo1();
  ob.show();
  ob.change();
  ob.show();
 }
}