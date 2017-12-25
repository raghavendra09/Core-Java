import java.util.*;
class Arr4
{
 public static void main(String args[])
 {
  int i,j;
  Scanner sc=new Scanner(System.in);
  int [][]a=new int[3][3];
  int [][]b=new int[3][3];
  int [][]c=new int[3][3];
  System.out.println("Matrix A is:");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    System.out.println("a["+i+"]["+j+"]= ");
    a[i][j]=sc.nextInt();
   }
  }
  System.out.println("Matrix B is:");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    System.out.println("b["+i+"]["+j+"]= ");
    b[i][j]=sc.nextInt();
   }
  }
  System.out.println("C=A+B is:");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    c[i][j]=a[i][j]+b[i][j];
    System.out.println("\n \t"+c[i][j]);
   }
  }
 }
}