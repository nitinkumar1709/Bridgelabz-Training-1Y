import java.util.Scanner;
class perimeter
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter length");
	float length = sc.nextFloat();
	System.out.println("enter breadth");
	float breadth = sc.nextFloat();
	


	float perimeter = 2*(length+breadth);
	System.out.println("perimeter is"+perimeter);

	}
}