import java.util.*;
class whilefactor
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a ;
		System.out.print("enter a number: ");
		a=input.nextInt();
		int i=0;
		while(i<=a)
		{
			i++;
			if(a%i==0)
			{
				System.out.println("factor is: "+i); 
			}
		}
	}
}