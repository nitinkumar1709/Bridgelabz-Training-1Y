import java.util.Scanner;
class calculatorswitch
{
	public static void main(String args[])
	{  
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter first number");
	 double first = sc.nextDouble();
	 
	 System.out.println("enter second number");
	 double second = sc.nextDouble();
	 
	 System.out.println("enter operator (+,-,/,*):");
	 char op = sc.next().charAt(0);
	  switch (op)
	  {
		  case'+':
		  System.out.println("result = "+(first+second));
		  break;
		  
		  case'-':
		  System.out.println("result = "+(first-second));
		  break;
		  
		  case'*':
		  System.out.println("result = "+(first*second));
		  break;
		  
		  case'/':
		  if(second !=0){
		  System.out.println("result = "+(first/second));
		  }
		  else{
			    System.out.println("div by zero not allowed");
		  }
		  break;
		  default:
		    System.out.println("invalid operator");
	 }
	}
	}