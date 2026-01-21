import java.util.Scanner;
class profit
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter costprice");
	int costprice = sc.nextInt();
	System.out.println("enter sellingprice");
	int sellingprice=sc.nextInt();
	int profit=sellingprice-costprice;
	System.out.println("profit is"+profit);
	
	int profitpercent=profit*100/costprice;
	System.out.println("profitpercent is"+profitpercent);

	}
}