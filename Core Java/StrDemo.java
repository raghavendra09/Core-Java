class StrDemo
{
 public static void main(String args[])
 {
  String st1="apple";
  String st2="   APPLE     ";
  String st3="welcome to learn core java";
  System.out.println("String-1 is: "+st1);
  System.out.println("String-2 is: "+st2);
  System.out.println("String-1 length is: "+st1.length());
  System.out.println("String-2 length is: "+st2.length());
  st2=st2.trim();
  System.out.println("After trim String-2 length is: "+st2.length());
  System.out.println("Upper String is: "+st1.toUpperCase());
  System.out.println("Lower String is: "+st1.toLowerCase());
  System.out.println("String-1 equals String-2 is: "+st1.equals(st2));
  System.out.println("String-1 equals String-2 using ignorecase is: "+st1.equalsIgnoreCase(st2));
  System.out.println("Character at 5th position is: "+st3.charAt(5));
  System.out.println("Substring from 5th pos is: "+st3.substring(5,10));
  System.out.println("String-1 concat withString-2 is: "+st1.concat(st2));
  System.out.println("replace é'with 'E' is: "+st3.replace('e','E'));
  System.out.println("Index of 'e' is: "+st3.indexOf('e'));
  System.out.println("Index of 'e' after10th pos is: "+st3.indexOf('e',10));
  System.out.println("last Index of 'e' after 10th pos is: "+st3.lastIndexOf('e'));
 }
}