class Main
{
	public static void main(String args[])
	{
		classCars mycarObj = new classCars("Lamborghini", 99);
		System.out.println("Car Brand: "+ mycarObj.firstBrand + " HorsePower: " + mycarObj.firstBrandHP);
		mycarObj.carStart();
	}
}