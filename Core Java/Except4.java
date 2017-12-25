class Except4
{
 static void demo()
 {
  try
  {
   throw new NullPointerException("My demo Exception");
  }
  catch(NullPointerException e)
  {
   System.out.println("Caught inside demo: "+e);
   throw e;//rethrow the exception
  }
 }
 public static void main(String args[])
 {
  try
  {
   demo();
  }
  catch(NullPointerException e)
  {
   System.out.println("recaught: "+e);
  }
 }
}