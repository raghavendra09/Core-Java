class Car
{
	public void color()
	{
    System.out.println("black");
    }
}
class Audi extends Car
{
	public static void main(String[] args) 
	{
		Audi obj = new Audi();
		obj.color();
		System.out.println();
	}
}
