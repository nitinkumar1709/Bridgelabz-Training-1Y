import java.util.Scanner;
class handshakes
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the n no of students");
	double n = sc.nextDouble();
	
	double maxhandshakes = (n*(n-1))/2;
	
	System.out.println(" max number of handshakes are"+maxhandshakes);
	
	}
}