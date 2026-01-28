import java.util.Scanner;
class abundant
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter a number");
	 int number = sc.nextInt();

	 int sum =0;
	 for (int i=1;i<number;i++)
	 {
		 if(number%i == 0){
			 sum=sum+i;
		 }
	 }
	 if (sum > number){
		  System.out.println("abundant number");
	 }
	 else {
		
		  System.out.println("not an abundant");
	 }
	}
}