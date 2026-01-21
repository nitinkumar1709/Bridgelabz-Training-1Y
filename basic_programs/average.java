import java.util.Scanner;
class average
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter first no");
	float first = sc.nextFloat();
	System.out.println("enter second no");
	float second = sc.nextFloat();
	System.out.println("enter third no");
	float third = sc.nextFloat();
	


	float avg = (first+second+third)/3;
	System.out.println("average of three numbers is"+avg);

	}
}