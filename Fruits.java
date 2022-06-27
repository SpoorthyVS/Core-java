class Fruits{
		String name;
		int price;
		
	public static void main (String a[])
	{
		Fruits f= new Fruits ("Mango",789);	
		System.out.println(f.name + "   " + f.price);
	}
	
	public Fruits()
	{
		this("orange",90);
		System.out.println("Fruits object is created");
	}
	
	

	public Fruits(String name , int price)
	{
	this();
	this.name = name;
	this.price = price;
	}
	public static void provideNutrition()
	{
		System.out.println("helps us to get nutrition");
	}

}