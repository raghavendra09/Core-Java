class B
{
 Sample15 obj;
 B(Sample15 obj)
 {
  this.obj=obj;
 }
 void display()
 {
  System.out.println("Data is : "+obj.data);
 }
}
class Sample15
{
 int data=10;
 Sample15()
 {
  B b=new B(this);
  b.display();
 }
 public static void main(String args[])
 {
  Sample15 a=new Sample15();
 }
}