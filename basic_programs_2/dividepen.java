import java.util.Scanner;
class dividepen
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter no. of pen");
	int pens = sc.nextInt();
	
	System.out.println("enter no. of students");
	int students = sc.nextInt();
	
    int equallydivided=pens/students;
	System.out.println("equally divided pens"+equallydivided);
	
	int remainingpens = pens % students;
    System.out.println("remaining pens"+remainingpens);
	}
}