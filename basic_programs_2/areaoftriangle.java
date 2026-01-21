import java.util.Scanner;
class areaoftriangle
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter base of triangle in inches");
     double base = sc.nextDouble();
	
	System.out.println("enter height in inches");
	double height = sc.nextDouble();
	
    double areaininches=0.5*base*height;
	System.out.println("area of tri in inches is"+areaininches);
	
	double areaincm = areaininches*2.54;
    System.out.println("area of tri in cm is"+areaincm);
	}
}