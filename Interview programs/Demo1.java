interface Demo
{ 
  public void Dm();
  public void Md();
}
class Demo1 implements Demo
{
	public void Dm()	
 { 
		System.out.println( "DEM" );
 }
    public void Md()   
 { 
	System.out.println( "MED" );
 }
	
	public static void main(String[] args) 
	{
		System.out.println();
		Demo1 D = new Demo1();
		D.Dm();
		D.Md();
        System.out.println();

	}
}
