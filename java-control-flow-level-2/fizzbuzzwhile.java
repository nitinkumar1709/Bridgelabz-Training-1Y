import java.util.Scanner;
class fizzbuzzwhile
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter a positive number");
	 int n = sc.nextInt();
	 int i=1;
	 if (n<=0){
		  System.out.println("enter a positive number");
	 }
	 
	 else{
	 while (i<=n){
		  if (i%3 ==0 && i%5 ==0){
	   System.out.println("fizzbuzz");
	  }
	   else if (i%3 ==0 ){
	   System.out.println("fizz");
	}
	 else if ( i%5 ==0){
	   System.out.println("buzz");
}
else {
	System.out.println("i");
}
 i++;
	  }
	 }
	 }
	}