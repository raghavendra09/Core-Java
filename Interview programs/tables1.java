import java.util.*;
class tables1 
{
	public static void main(String[] args) 
	{
		int i,j,n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter no");
		n = s.nextInt();
		for(i=1; i<=n; i++)
		{
			for(j=i; j<=10; j++)
			{
				int r=i*j;
				System.out.println(r+" ");
			}
			System.out.println(" ");
		}
	}
}
