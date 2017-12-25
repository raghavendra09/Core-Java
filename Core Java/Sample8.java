class Student
{
 private int sno;
 private String sname,course;
 private double fees;
 void setdata(int no,String sna,String cor,double fee)
 {
  sno=no;
  sname=sna;
  course=cor;
  fees=fee;
 }
 void showdata()
 {
  System.out.println("sno:"+sno+"\t sname:"+sname+"\t course:"+course+"\t fees:"+fees);
 }
}
class Sample8
{
 public static void main(String args[])
 {
  Student s=new Student();
  s.showdata();
  s.setdata(100,"üday","Devops",61000);
  s.showdata();
 }
}