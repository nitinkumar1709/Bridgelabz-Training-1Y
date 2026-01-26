import java.util.Scanner;
class sumofno
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the number");
	double total=0.0;
	double num;
	 System.out.println("enter the number(0 to stop):");
	 num=sc.nextDouble();
	 
	 while(num !=0){
		 total =+ num;
		  System.out.println("enter the number(0 to stop):");
		  num = sc.nextDouble();
	 }
	   System.out.println("total sum = "+total);
	 
		  
	
	

	}
}