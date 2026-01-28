import java.util.Scanner;
class armstrong
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter a number");
	 int number = sc.nextInt();
	 int originalnumber = number;
	 int sum =0;
	 while (originalnumber !=0){
		 
		 int digit = originalnumber % 10;
		 sum = sum + (digit*digit*digit);
		 originalnumber = originalnumber/10;
	 }
	 if (sum == number){
		  System.out.println("armstrog number");
	 }
	 else {
		  System.out.println("not an armstrong number");
	 }
	}
}
		 
	
	