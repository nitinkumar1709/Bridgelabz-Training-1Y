import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter a number");
	 int num = sc.next.Int();
	
	boolean isprime = true;
	
	if (num<=1){
		isprime=false;
	}
	else{
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
			{
				isprime=false;
				break;
			}
	}
	}
	if (isprime){
	System.out.println("prime number");
	}
	else{
		System.out.println("not a prime number");
	}
}
}
	  