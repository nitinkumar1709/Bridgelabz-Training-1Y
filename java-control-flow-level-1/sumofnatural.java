import java.util.Scanner;
class sumofnatural
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the number");
	int n = sc.nextInt();
	  
	 if(n>0){
		 int sum= n*(n+1)/2;
		 System.out.println("sum of natural number is"+sum);
	 }
	 else{
		 System.out.println("not a natural number");
	 }

	}
}