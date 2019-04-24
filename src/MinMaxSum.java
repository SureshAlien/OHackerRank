
public class MinMaxSum {

	public static void main(String[] args) 
	{
		int arr[] = {140537896,243908675,670291834,923018467,520718469};	
		long max = 0,min=0;	
		int skipping_index=0;		
		int count =1 ;
		
		for (int i = 0; i < arr.length; i++) 
		{	
			long temp = 0 ;
			for (int j = 0; j < arr.length; j++) 
			{
				if(skipping_index != j)
				{ 
					temp += arr[j];
				}
				
			}
			skipping_index++;
			
			if(max<temp)
				max= temp ;
					
			if (count == 1) 
				min =temp ;
			
			if (min>temp)
				min =temp ;
			count ++ ;

		}
		
		System.out.println(min + "  " + max);

	}

}
