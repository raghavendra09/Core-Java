class Stu
{
 int sno;
 String sname;
 static String college="NIIT";
 Stu(int no,String sna)
 {
  sno=no;
  sname=sna;
 }
 void output()
 {
  System.out.println("sno:"+sno+"\tsname:"+sname+"\t college:"+college);
 }
}
class StaticDemo
{
 public static void main(String args[])
 {
  Stu ob1=new Stu(100,"Uday");
  Stu ob2=new Stu(200,"Kiran");
  ob1.output();
  ob2.output();
 }
}