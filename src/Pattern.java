
public class Pattern 
{
	public static void main(String[] args) 
	{
		int n=5 ;
		for (int row=0 ; row<n ; row++)
		{
			if(row == n-1) 
			{
				for (int col=0 ; col<=row ; col++)
				{
					System.out.print( "#" );
			
				}			
			}
			else
			{
				for (int col=n-1; col>row ; col--)
				{
					System.out.print( " " );
			
				}
				
				for (int col=0 ; col<=row ; col++)
				{ 
					System.out.print( "#" );
			
				}
				
				System.out.println();
				
			}
			


		}
		
	}

}
