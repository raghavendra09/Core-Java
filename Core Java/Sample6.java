class Cls
{
 private int x;
 public int y;
 protected int z;
 int temp;
 void display()
 {
  System.out.println("Private data is: "+x);
  System.out.println("Public data is: "+y);
  System.out.println("Protected data is: "+z);
  System.out.println("Default data is: "+temp);  
 }
}
class Sample6
{
 public static void main(String args[])
 {
  Cls ob=new Cls();
  System.out.println("\n\n Accessing members without using display method: ");
  //System.out.println("Private data is: "+ob.x);
  System.out.println("Public data is: "+ob.y);
  System.out.println("Protected data is: "+ob.z);
  System.out.println("Default data is: "+ob.temp);
  System.out.println("\n\n Accessing members with using display method: ");
  ob.display();
 }
}