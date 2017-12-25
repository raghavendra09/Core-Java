import java.util.*;
class fibonocci 
{
	public static void main(String[] args) 
	{
		int a=1, b=1, c, n, i=1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter no terms");
		n = s.nextInt();
		System.out.println(a+"\n"+b);

		while(i<=n)
		{
         c=a+b;
		 System.out.println(c);
		 a=b;
		 b=c;
		 i++;
		}

	}
}
