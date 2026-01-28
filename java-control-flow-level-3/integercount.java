import java.util.Scanner;
class integercount
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter an integer");
	 int number = sc.nextInt();

	 int count =0;
	
	 
	 if (number == 0){
		 count = 1;
		  System.out.println("armstrog number");
	 }
	 else {
		 while (number !=0){
			 number = number/10;
			 count++;
		 }
	 }
		  System.out.println("number of digits = " +count);
	 }
	}
