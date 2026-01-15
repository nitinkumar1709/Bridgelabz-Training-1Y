import java.util.Scanner;
class sam
{
	public static void main(String args[])
	{  
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter maths");
	int maths = sc.nextInt();
	System.out.println("enter physics");
	int physics=sc.nextInt();
	System.out.println("enter chemistry");
	int chemistry=sc.nextInt();
	
	int average=(maths+physics+chemistry)/3;
		
		System.out.println("average is"+average);
	}
}