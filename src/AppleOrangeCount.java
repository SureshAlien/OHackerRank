
public class AppleOrangeCount {

	public static void main(String[] args) 
	{
	int	s_home_start =7, t_home_end =11, a_apple=5, b_orange=15;
	int apples[]= {-2,2,1};
	int oranges[] = {5,-6};
	
	int home_apple_count = 0 ,home_orange_count = 0;
	
	int temp_apple[] = new int[apples.length];
	int temp_orange[] = new int[oranges.length];

	
	for (int i = 0; i < apples.length; i++) 
	{
		temp_apple[i] = (apples[i] + a_apple ) ;
		
	}
	
	for (int i = 0; i < oranges.length; i++) 
	{
		temp_orange[i] = (oranges[i] + b_orange ) ;
		
	}
	
	for (int i = 0; i < temp_apple.length; i++) 
	{
		if(temp_apple [i] >= s_home_start && temp_apple [i] <= t_home_end  )
		{
			home_apple_count += 1 ;
			
		}
		
	}
	
	for (int i = 0; i < temp_orange.length; i++) 
	{
		if(temp_orange [i] >= s_home_start && temp_orange [i] <= t_home_end  )
		{
			home_orange_count += 1 ;
			
		}
		
	}
	
	System.out.println(home_apple_count);
	System.out.println(home_orange_count);

	

	} //end of main

}


/*

7 11
5 15
3 2
-2 2 1
5 -6


*/