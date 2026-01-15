 import java.util.Scanner;
class cmtofeet
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter height in cm");
	double cm = sc.nextDouble();
	
	double inch = cm/2.54;
	System.out.println("height in inch is"+inch);
	
	double feet = inch/12;
	System.out.println("height in feet"+feet);
	
	}
}