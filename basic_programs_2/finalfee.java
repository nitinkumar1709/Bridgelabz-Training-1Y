import java.util.Scanner;
class finalfee
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the fee of student");
	int fee = sc.nextInt();
	
	System.out.println("enter the given disc");
	int disc = sc.nextInt();
	
    int discount =(fee*disc)/100;
	System.out.println("discountedamount is"+discount);
	
	int finalfee =fee-discount;
	System.out.println("finalfee is"+finalfee);
	}
}