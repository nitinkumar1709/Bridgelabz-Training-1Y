import java.util.Scanner;
class div
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the age");
	int age = sc.nextInt();
	  
	 if(age >= 18){
		 System.out.println("person can vote");
	 }
	 else{
		 System.out.println("cannot vote");
	 }

	}
}