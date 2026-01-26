import java.util.Scanner;
class ifdiv5
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the number");
	int number = sc.nextInt();
	  
	 if(number%5 == 0){
		 System.out.println("divisible by 5");
	 }
	 else{
		 System.out.println("not divisible");
	 }

	}
}