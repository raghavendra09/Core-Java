import java.io.*;
class MyException extends Exception
{
 double d;
 MyException(double x)
 {
  d=x;
  System.out.println("MyException Amount is :"+d);
 }
 public String toString()
 {
  return("need Amount:"+d);
 }
}
class CheckingAccount
{
 private double balance;
 private int number;
 CheckingAccount(int number)
 {
  this.number=number;
 }
 void deposit(double amount)
 {
  balance += amount;
 }
 void withdraw(double amount) throws MyException
 {
  if(amount<=balance)
  {
   balance -= amount;
  }
  else
  {
   double needs=amount-balance;
   throw new MyException(needs);
  }
 }
 double getBalance()
 {
  return balance;
 }
 int getNumber()
 {
  return number;
 }
}
class BankDemo
{
 public static void main(String args[])
 {
  CheckingAccount c=new CheckingAccount(1162110514);
  System.out.println("My Account no is: "+c.getNumber());
  System.out.println("Depositing $500.......");
  c.deposit(500.00);
  try
  {
   System.out.println("\n Withdrawing $100.......");
   c.withdraw(100.00);
   System.out.println("Current Balance is:"+c.getBalance());
   System.out.println("\n withdraw $600.....");
   c.withdraw(600.00);
  }
  catch(MyException e)
  {
   System.out.println("soory,but you "+e);
  }
 }
}