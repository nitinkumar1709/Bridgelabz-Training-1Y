import java.util.Scanner;
class km_to_miles
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter km");
	double km = sc.nextDouble();
	double miles=km*1.6;
	System.out.println("miles is"+miles);

	}
}