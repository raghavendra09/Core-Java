import java.util.*;
class Except1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  try
  {
   int a,b,c;
   System.out.println("Enter a,b vlaues: ");
   a=sc.nextInt();
   b=sc.nextInt();
   c=a/b;
   System.out.println("Division is :"+c);
  }
  catch(ArithmeticException e)
  {
   System.out.println("Error: "+e);
  }
  catch(InputMismatchException e2)
  {
   System.out.println("Error-2: "+e2);
  }
  finally
  {
   System.out.println("Pgm is completed........");
  }
 }
}