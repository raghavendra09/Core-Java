import java.util.Scanner;
class Ifelse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc.nextInt();
        System.out.println("enter the value of b");
		int b = sc.nextInt();
		System.out.println("enter the value of c");
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(" a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else 
		{
			System.out .println("c is graeter");
		}
	}
}
