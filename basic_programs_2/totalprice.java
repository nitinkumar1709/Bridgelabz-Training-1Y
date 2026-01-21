import java.util.Scanner;
class totalprice
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the unit price");
	double unitprice = sc.nextDouble();
	
	System.out.println("enter the quantity");
	double quantity = sc.nextDouble();
	
	double totalprice=unitprice*quantity;
	
	System.out.println("total price is"+totalprice);
	
	}
}