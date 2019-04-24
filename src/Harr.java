
public class Harr {

	public static void main(String[] args) 
	{
		int arr[] = {-4,3,-9,0,4,1};
		System.out.println("checking"+arr.length);	
		int pos_count = 0;
		int neg_count = 0;
		int zero_count = 0;
		float pos_ratio,neg_ratio,zero_ratio;

		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("checking"+arr[i]);	

			
			if(arr[i]>0)
				pos_count += 1;
			else if (arr[i]<0)
				neg_count += 1;
			else
				zero_count += 1;
			

	
		}
		System.out.println("pos_count"+pos_count + "neg_count"+neg_count+ "zero_count"+zero_count );
		
		 pos_ratio = ((float)pos_count / arr.length) ;
		 System.out.println("arr.length" + arr.length );
		 System.out.println( pos_ratio );
		 System.out.printf("%.6f" , pos_ratio );	

		 neg_ratio = ((float)neg_count / arr.length) ;
		 System.out.println("arr.length" + arr.length );
		 System.out.println( neg_ratio );
		 System.out.printf("%.6f" , neg_ratio );
		 
		 zero_ratio = ((float)zero_count / arr.length) ;
		 System.out.println("arr.length" + arr.length );
		 System.out.println( zero_ratio );
		 System.out.printf("%.6f" , zero_ratio );
		 

		 
		 //int len = 2 ;
		 //float f = float(len);
		 
		//System.out.println("pos_ratio" + checke );	

	    //System.out.format("%.6f", checke);
		/*System.out.println();
	    System.out.format("%.6f", neg_ratio);
		System.out.println();
	    System.out.format("%.6f", zero_ratio);
		System.out.println(); */

	}

}
