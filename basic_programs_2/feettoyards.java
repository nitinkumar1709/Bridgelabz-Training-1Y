import java.util.Scanner;
class feetstoyards
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the distance in feets");
	double feets = sc.nextDouble();
	
	double yards = feets/3;
	
	System.out.println("distance in yards is"+yards);
	double miles = feets/5280;
	
    System.out.println("distance in miles is"+miles);
	}
}