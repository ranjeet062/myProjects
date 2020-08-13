
public class PrintShapes {

	public static void main(String[] args) {

		System.out.println("Ladder------------");
		//printLadder();
		getLadder(4);
		System.out.println("Piramid------------");
		getPramid(4);
		
		//System.out.println("Reverse Ladder");
		//printReverseLadder();
	}

	public static void printLadder()
	{
		for(int i=0; i< 4; i++){
			for(int j =0; j<= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void printReverseLadder()
	{
		for(int i=4; i>=0; i--){
			for(int j = 0; j == i; j++)
			{
				System.out.print("*");
			}
			System.out.print("");
		}
	}
	
	private static void getLadder( int n )
    {
        int i=0;
        while(i <= n-1)
        {
            int j=0;
            while(j <= n-1)
            {
                if(i >= j)
                {
                System.out.print( "*" );
                }
                j++;
            }
            System.out.println( "" );
            i++;
        }
    }

    private static void getPramid(int n)
    {
        
        int i=n-1;
       
        while(i >= 0)
        {
            int j=0;
            while(j < n*2)
            {
                if(j >=i && (i+j+1) < n*2)
                    System.out.print("*");
                else
                    System.out.print(" ");
                j++;
            }
            i--;
            System.out.println( "" );
        }
    }
}
