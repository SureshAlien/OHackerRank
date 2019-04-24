
public class StudentMarkRounding {

	public static void main(String[] args) {

		int grades[] = {73,67,38,33} ;
		
		int result[]= new  int [grades.length];
		int count = 0 ;
		for (int i : grades)
		{
			int after_rounding = i ;
			
			if(i>=38)
			{
				int multiple_five = get_multiple_five(i);
				
				if ((multiple_five - i) <3 )
					after_rounding = multiple_five ;
				
			}
			
			System.out.println("befor roun"+ i+"after round" + after_rounding);		
			result[count] = after_rounding ;
			count ++ ;

		}
		System.out.println("array"+ result[2]);	

		
	}

	private static int get_multiple_five(int i)
	{
		int multiple_five= 0 ;
		for (int j = i; j <i +5 ; j++) {
			if((j % 5) == 0 )
			{
				multiple_five = j ;
				break;
			}
			
		}
		return multiple_five;
	}

}
