class ThisDemo1
{
 int a,b,c;
 void setdata(int a,int b,int c)
 {
  this.a=a;
  this.b=b;
  this.c=c;
 }
 void show()
 {
  System.out.println("a= "+a+"\tb= "+b+"\tc= "+c);
 }
}
class Sample12
{
 public static void main(String args[])
 {
  ThisDemo1 ob=new ThisDemo1();
  ob.setdata(11,22,33);
  ob.show();
 }
}