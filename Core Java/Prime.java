import java.util.*;
class Prime
{
 public static void main(String args[])
 {
  int i,n,m=0,flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter n value :");
  n=sc.nextInt();
  m=n/2;
  for(i=2;i<=m;i++)
  {
   if(n%i==0)
   {
    System.out.println("givem no is not prime");
    flag=1;
    break;
   }
  }
  if(flag==0)
  System.out.println("given no is prime");
 }
}