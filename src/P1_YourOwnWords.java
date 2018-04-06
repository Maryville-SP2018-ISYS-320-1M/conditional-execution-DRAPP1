import java.util.Scanner;

//	ISYS 320 - DONE!!! DONE!! DONE!!
//	Name(s): Dave Rapp
//	Date: 4-3-18


/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
Your conditional expression
 (y is positive) = y > 0

 Your test values for x, y, z and do you expect true or false?
 -- 1,2,0 = True
 -- 2,1,0 = True
/*

/* 2. 
Your conditional expression
 (x is not zero) = x !=0

Your test values for x, y, z and do you expect true or false?
-- 1,2,0 = True
-- 2,1,0 = True
*/

/* 3.  
Your conditional expression
 (y * z is odd) = y*z %2==1

Your test values for x, y, z and do you expect true or false?
-- 1,2,0 = False
-- 2,1,0 = False
*/

/* 4.  
Your conditional expression
 (y is at least the sum of z and x) = y >= z+x

Your test values for x, y, z and do you expect true or false?
-- 1,2,0 = True
-- 2,1,0 = False

*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter test values for x, y, and z, separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if( y >= z+x ) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

	}

}
