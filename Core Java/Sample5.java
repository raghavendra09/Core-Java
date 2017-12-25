import java.util.*;
class Sample5
{
 int x,y;
 Scanner sc=new Scanner(System.in);
 void input()
 {
  System.out.println("enter x,y values : ");
  x=sc.nextInt();
  y=sc.nextInt();
 }
 void output()
 {
  System.out.println("x value is: "+x+"\t y value is:"+y);
 }
 public static void main(String args[])
 {
  Sample5 ob=new Sample5();
  ob.output();
  ob.input();
  ob.output();
 }
}