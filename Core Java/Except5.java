class Except5
{
 static void validate(int age)
 {
  try
  {
   if(age<18)
        throw new ArithmeticException("not valid");
   else
        System.out.println("Welcome to Vote");
  }
  catch(ArithmeticException e)
  {
   System.out.println("Error: "+e);
  }
 }
 public static void main(String args[])
 {
  validate(13);
  System.out.println("rest of the code...");
 }
}