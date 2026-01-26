import java.util.Scanner;
class oddeven
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter a natural number");
	 int number = sc.nextInt();
	 
	 if ( number <=0){
		  System.out.println("please enter a natural number");
	 }
	 else {
		 for (int i = 1;i<=number;i++)
		 {
			 if (i%2 == 0){
		  System.out.println("number is even");
	 }
	 else {
		  System.out.println("number is odd");
	 }
		 }
	 }
	}
}
		 