import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter first number");
	float firstno = sc.nextFloat();
	System.out.println("enter second number");
	float secondno = sc.nextFloat();
	
	float addition = firstno+secondno;
	System.out.println("addition is"+addition);
	
		float subs = firstno-secondno;
	System.out.println("subtraction is"+subs);

	float mult = firstno*secondno;
	System.out.println("multiplication is"+mult);

	float div = firstno/secondno;
	System.out.println("division is"+div);

	}
}