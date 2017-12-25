class ThisDemo3
{
 void p()
 {
  System.out.println("Method p() is invoked........");
 }
 void m()
 {
  this.p();
 }
 void n()
 {
  this.m();
 }
}
class Sample14
{
 public static void main(String args[])
 {
  ThisDemo3 ob=new ThisDemo3();
  ob.n();
 }
}