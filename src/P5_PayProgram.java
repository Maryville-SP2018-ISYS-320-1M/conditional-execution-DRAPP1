import java.util.Scanner;

/*
	ISYS 320 DONE DONE DONE!!! **
	Name(s): Dave Rapp
	Date: 4-3-18
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
		
		double result = pay(hourlyRate, numOfHoursWorked);
		System.out.println("pay = " + result);
		
		result = pay(hourlyRate , numOfHoursWorked);
		System.out.println("pay = " + result);
		
	}
	
	
	public static double pay(double hourlyRate, int numOfHoursWorked)
	{
		if (numOfHoursWorked >= 8)
		{
			return (8 * hourlyRate) + (numOfHoursWorked - 8) * (hourlyRate *1.5);
		
		}
		return hourlyRate * numOfHoursWorked;
	}
	}
		
			
		
		
		

	


