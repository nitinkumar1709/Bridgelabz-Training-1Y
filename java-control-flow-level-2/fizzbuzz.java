import java.util.Scanner;
class fizzbuzz
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter a positive number");
	 int n = sc.nextInt();
	 if (n<=0){
		  System.out.println("enter a positive number");
	 }
	 
	 else{
	  for (int i=1;i<=n;i++){
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
	  }
	 }
	 }
	}