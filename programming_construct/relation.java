import java.util.Scanner;
class relation
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter a");
	int a = sc.nextInt();
	  
	 if(a>18){
		 System.out.println("a is allowed");
	 }
	 else{
		 System.out.println("a is not allowed");
	 }

	}
}