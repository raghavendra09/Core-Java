class Except3
{
 public static void main(String args[])
 {
  try
  {
   try
   {
    System.out.println("Division process:");
    int b=30/0;
   }
   catch(ArithmeticException e)
   {
    System.out.println(e);
   }
   try
   {
    int []a=new int[5];
    a[5]=4;
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println(e);
   }
   System.out.println("other Statements");
  }
  catch(Exception e)
  {
   System.out.println("Handeled");
  }
  finally
  {
   System.out.println("Normal flow....");
  }
 }
}