import java.util.*;
class Student
{
 int sno;
 String sname,address;
}
class College extends Student
{
 String clgname;
}
class Marks extends College
{
 int m1,m2,m3,tot,avg;
 Scanner sc=new Scanner(System.in);
 void getdata()
 {
  System.out.println("enter sno: ");
  sno=sc.nextInt();
  System.out.println("enter sname: ");
  sname=sc.next();
  System.out.println("enter Address: ");
  address=sc.next();
  System.out.println("enter College name: ");
  clgname=sc.next();
  System.out.println("enter 3 marks: ");	
  m1=sc.nextInt();
  m2=sc.nextInt();
  m3=sc.nextInt();
  tot=m1+m2+m3;
  avg=tot/3;
 }
 void output()
 {
  System.out.println("sno: "+sno+"\n sname: "+sname+"\n Address: "+address+"\n college name:"+clgname+"\n marks: "+m1+","+m2+","+m3+"\nTotal: "+tot+"\n Avg: "+avg);
 }
}
class Inh2
{
 public static void main(String args[])
 {
  Marks ob=new Marks();
  ob.getdata();
  ob.output();
 }
}