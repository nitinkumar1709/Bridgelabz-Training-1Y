import java.util.Scanner;
class bmi
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter weight in kg");
	 double weight = sc.nextDouble();
	 
	 System.out.println("enter height in cm");
	 double heightcm = sc.nextDouble();
	 
	 double heightm = heightcm/100;
	 
	 double bmi = weight/(heightm*heightm);
	 
	  System.out.println("bmi is"+bmi);
	}
}