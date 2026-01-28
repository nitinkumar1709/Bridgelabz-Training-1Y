import java.util.Scanner;
class harshad
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter a number");
	 int number = sc.nextInt();

	 int originalnumber =number;
	 int sum=0;
	 
	 while (number !=0)
	 {
		 sum=sum+(number%10);
		 number=number/10;
	 }
	 
	
	 
	 if (originalnumber % sum == 0){
		
		  System.out.println("harshad number");
	 }
	 else {
		
		  System.out.println("not a harshad");
	 }
	}
}