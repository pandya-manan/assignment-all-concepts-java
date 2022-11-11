package practice;

public class DemoRun {
	
	public static void main(String[] args)
	{
		
		mananPandya();
		mananPandya(24);
		mananPandya(25,"Bangalore");
		mananPandya("Bangalore City",24);
	}
	
	public static void mananPandya(int age, String address)
	{
		System.out.println(age+" "+address);
	}
	
	public static void mananPandya(String address, int age)
	{
		System.out.println("I am Manan aged: "+age+" at "+address); 
	}
	
	public static void mananPandya()
	{
		System.out.println("I am Manan");
	}
	
	public static void mananPandya(int age)
	{
		System.out.println("I am Manan aged: "+age);
	}
	
	

}
