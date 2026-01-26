import java.util.*;
class friend
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.print("enter the age and height amar: ");
		a=input.nextInt();
		System.out.print("enter the age and  height anthony : ");
		b=input.nextInt();
		System.out.print("enter the age and height akbar: ");
		int c=input.nextInt();
		if (a<b && a<c)
		{
			System.out.println("amar is youngest: " +a);
		}
		else if (b<a && b<c)
		{
			System.out.println("anthony is youngest: " +b);
		}
		else if(c<a && c<b)
		{
			System.out.println("akbar is youngest: " +c);
		}
		System.out.println("enter the height amar: ");
		int p=input.nextInt();
		System.out.println("enter the height anthony : ");
		int q=input.nextInt();
		System.out.println("enter the height akbar: ");
		int r=input.nextInt();
		if(p>q && p>r)
		{
			System.out.print("amar is tallest");
		}
		if(q>p && q>r)
		{
			System.out.print("anthony is tallest");
		}
		if(r>q && r>p)
		{
			System.out.print("akbar is tallest");
		}
	}
}