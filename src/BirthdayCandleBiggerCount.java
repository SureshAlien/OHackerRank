
public class BirthdayCandleBiggerCount {

	public static void main(String[] args) {
		
		int arr[] = {2,3,1,3,3,3};
		int max =0;
		int count = 0;
		for (int i = 0 ;i<arr.length; i++)
		{
			if(arr[i] >max)
				max = arr[i];
				
		}
		

		for (int i: arr) 
		{
			if (i == max)
				count ++;
	     
		}
		
		System.out.println(count);
		

	}

}
