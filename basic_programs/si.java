import java.util.Scanner;
class si
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter principal");
	float principal = sc.nextFloat();
	System.out.println("enter rate");
	float rate = sc.nextFloat();
	System.out.println("enter time");
	float time = sc.nextFloat();
	


	float interest = (principal*rate*time)/100;
	System.out.println("interest  is"+interest);

	}
}