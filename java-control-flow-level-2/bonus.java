import java.util.Scanner;
class bonus
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter salary");
	  double salary = sc.nextDouble();
	   System.out.println("enter years of service");
	   
	   int years=sc.nextInt();
	   double bonus = 0;
	 
	 if ( years > 5){
		 bonus = salary*0.05;
	 }
		  System.out.println("bonus amount is");
	 }
	 
	 }