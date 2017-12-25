import java.util.*;
class Arr2
{
 public static void main(String args[])
 {
  int i,j,r,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter how many rows & cols: ");
  r=sc.nextInt();
  c=sc.nextInt();
  int [][]a=new int[r][c];
  System.out.println("Type"+r+"rows and"+c+"colmns");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    System.out.println("a["+i+"]["+j+"]= ");
    a[i][j]=sc.nextInt();
   }
  }
  System.out.println("Matrix format is: ");
  for(i=0;i<r;i++)
  {
   System.out.println();
   for(j=0;j<c;j++)
   {
    System.out.println("\n \t"+a[i][j]);
   }
  }
 }
}