/*
ISYS 320 DONE DONE DONE!!!
	Name(s):Dave Rapp
	Date: 4-7-18
*/

/*
 Your expected results after the input is provided:
 
 1.Error
 2.Error
 3. 34
 4.2930
  
 */
public class P4_IfElseMystery {

	public static void main(String[] args) {
		// Put your call to ifElseMyster2 here
		
		ifElseMystery(4, 4);
	

	}
	
    public static void ifElseMystery(int a, int b) {
    	
  
    	
        if (a * 2 < b) {
            a = a * 3;
        } else if (a > b){
            b = b + 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
            System.out.println(a + "" + b);
        }
    }

}
