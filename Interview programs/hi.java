import java.util.*;
class swap 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter 2 nos:");
		int a= s.nextInt();
			int b= s.nextInt();
			int c = a;
			a = b;
			b = c;

			System.out.println("swapping is: a = "+a  "b = "+b);
	}
		
}
