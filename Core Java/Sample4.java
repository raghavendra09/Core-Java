import java.util.*;
class Sample4
{
 public static void main(String args[])
 {
  int sno;
  String sname,course;
  double fees;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter sno : ");
  sno=sc.nextInt();
  System.out.println("enter sname : ");
  sname=sc.next();
  System.out.println("enter course : ");
  course=sc.next();
  System.out.println("enter fees : ");
  fees=sc.nextDouble();
  System.out.println("sno: "+sno+"\t sname: "+sname+"\t course: "+course+"\t fees: "+fees);
 }
}