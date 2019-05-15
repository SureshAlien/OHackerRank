
public class Kangaroo {

	public static void main(String[] args) 
	{
		int k_one_start = 0,k_two_start = 4,k_one_jump_distance = 3,k_two_jump_distance =2;
		
		int kone_jump_count = 0;
		int ktwo_jump_count = 0;
		long loop_count = 0 ;
		
		boolean check = false;
		
		for(long i=k_one_start, j= k_two_start ; i<= 10000 &&  j<=10000; i = i+k_one_jump_distance,j = j + k_two_jump_distance )
		{ 
			kone_jump_count ++; ktwo_jump_count ++ ;
			
			if ( loop_count != 0)
			{
				if( kone_jump_count == ktwo_jump_count && i == j ) {
					System.out.println("jumpcount"+kone_jump_count + "at location"+i+"loop_count"+loop_count+"i "+i+"j "+j);
					check =true;	
				}
			}
			loop_count ++;
		} //end for
		
		System.out.println("loop_count"+loop_count );
		
		System.out.println("total jump count upto 10000 kone_jump_count"+kone_jump_count );
		System.out.println("total jump count upto 10000 ktwo_jump_count"+ktwo_jump_count );
		



		if (check)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
		//debugcode
		System.out.println("*********************************************" );

		k_one_start = 0;k_two_start = 5;k_one_jump_distance = 2;k_two_jump_distance =3;
		 kone_jump_count = 0;
		 ktwo_jump_count = 0;
		for(long i=k_one_start, j= k_two_start ; i<= 10000 &&  j<=10000; i = i+k_one_jump_distance,j = j + k_two_jump_distance )

		{ 
			kone_jump_count ++; ktwo_jump_count ++ ;
			
	
		} //end for
		
		System.out.println("total jump count upto 10000 kone_jump_count"+kone_jump_count );
		System.out.println("total jump count upto 10000 ktwo_jump_count"+ktwo_jump_count );
		
		//end debug code
		
		
		/*int count_check = 0;
		for (int i = 0; i < 10000; i++) {
			count_check ++;	
		}
		System.out.println(count_check); 
		*/


	} //end of main

}

//0 2 5 3

//0 3 4 2