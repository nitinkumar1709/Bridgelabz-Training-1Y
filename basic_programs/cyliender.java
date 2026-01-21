import java.util.Scanner;
class cyliender
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter height");
	float height = sc.nextFloat();
	System.out.println("enter radius");
	float radius = sc.nextFloat();
	System.out.println("enter pi");
	float pi = sc.nextFloat();
	


	float cyliender = pi*(radius*radius)*height;
	System.out.println("volume of cyliender is"+cyliender);

	}
}