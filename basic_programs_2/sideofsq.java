import java.util.Scanner;
class sideofsq
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter perimeter of square");
	double perimeter = sc.nextDouble();
	
	double side=perimeter/4;
	
	System.out.println("side of square is"+side);
	

	}
}