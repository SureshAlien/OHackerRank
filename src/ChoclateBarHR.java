import java.util.*; 


public class ChoclateBarHR {
	

	
	public static void main(String[] args) {
		
		// For ArrayList 
        List<Integer> list = new ArrayList<Integer>() {{ 
            add(1); 
            add(3); 
            } }; 
        System.out.println("ArrayList : " + list); 
		
	}

}


/*
5
1 2 1 3 2
3 2

*/

/*
 * Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. She decides to share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can divide the chocolate.

Consider the chocolate bar as an array of squares,
. She wants to find segments summing to Ron's birth day, with a length equalling his birth month, . In this case, there are two segments meeting her criteria: and .
 */

*/