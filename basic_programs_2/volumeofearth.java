import java.util.Scanner;
class volumeofearth
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter the radius of earth");
	int rad = sc.nextInt();
	
	double volumeinkm = (4/3)*3.14*rad*rad*rad;
	
	System.out.println("volume of earth in km is"+volumeinkm);
	
	double volumeinmiles = volumeinkm*1/6*1/6*1/6;
    System.out.println("volume of earth in miles is"+volumeinmiles);
	}
}