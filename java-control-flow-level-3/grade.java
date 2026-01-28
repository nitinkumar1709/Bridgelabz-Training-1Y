import java.util.Scanner;
class grade
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter physics marks");
	double physics = sc.nextDouble();
	
	System.out.println("enter chemistry marks");
	double chemistry = sc.nextDouble();
	
	System.out.println("enter maths marks");
	double maths = sc.nextDouble();
	
	
	double average = (physics + chemistry + maths )/3;
	System.out.println("average marks"+average);
	
	
	  
	 if(average >= 80){
		 System.out.println("grade A");
	 }
	 else if(average >= 70){
	 System.out.println("grade B");
	 }
	  else if(average >= 60){
	 System.out.println("grade C");
	 }
    else if(average >= 50){
	 System.out.println("grade D");
	 }
	  else if(average >= 40){
	 System.out.println("grade E");
	  }
	  else {
     System.out.println("grage R");
	  }

	}
}