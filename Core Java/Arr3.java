import java.util.*;
class Arr3
{
 public static void main(String args[])
 {
  int n,i,big;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter how many elements: ");
  n=sc.nextInt();
  int []a=new int[n];
  System.out.println("type array elements: ");
  for(i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  big=a[0];
  for(i=0;i<n;i++)
  {
   if(a[i]>big)
   {
    big=a[i];
   }
  }
  System.out.println("Big elements is: "+big);
 }
}