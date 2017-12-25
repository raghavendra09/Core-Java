class Except2
{
 public static void main(String args[])
 {
  try
  {
   int x,y,z;
   int []a=new int[10];
   x=10;
   y=2;
   z=x/y;
   System.out.println("Division is: "+z);
   System.out.println("20th Array Index is:"+a[20]);
  }
  catch(Exception ob)
  {
   System.out.println("Error :"+ob);
  }
/*catch(ArithmeticException ae1)
  {
   System.out.println("Error :"+ae1);
  }
  catch(ArrayIndexOutOfBoundsException ae2)
  {
   System.out.println("Error-2 :"+ae2);
  }
  catch(NagitiveException ae3)
  {
   System.out.println("Error-3 :"+ae3);
  }
*/
  finally
  {
   System.out.println("Pgm is Completed");
  }
 }
}