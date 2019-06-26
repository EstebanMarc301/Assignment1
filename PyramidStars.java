import java.util.Scanner;

public class PyramidStars 
{
	public static void main(String args[])
	{
		Scanner pattern = new Scanner(System.in);
		System.out.println("1 = right triangle");
		System.out.println("2 = right triangle: Mirrored");
		System.out.println("3 = upside down pyramid");
		System.out.println("4 = pyramid");
		System.out.println("What star pattern would you like?: ");
		
		int pyramidPattern = pattern.nextInt();

		if(pyramidPattern == 1)
		{
			int i, j;
			for(i=0; i<5; i++)
			{
				for(j=0; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		
		if(pyramidPattern == 2)
		{
			int i, j, c;
			for(j=5; j>=1; j--)
			{
				for(i=0; i<5 - j; i++)
				{
					System.out.print("");
				}
				for( c = j; c >=1; c--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		if(pyramidPattern == 3)
		{
			int i, space, rows, k=0;
			Scanner amtRows = new Scanner(System.in);
			System.out.print("How many rows do you want?: ");
			rows = amtRows.nextInt();
			for(i=rows; i>=1; i--)
			{
				for(space= rows; space>i; space--) 
				{
					System.out.print("  ");
				}
				while(k < (i*2))
				{
					System.out.print(" *");
					k++;
				}
				k = 1;
				System.out.println();
			}
		}
		
		if(pyramidPattern == 4)
		{
			int i, space, rows, k=0;
			Scanner amtRows = new Scanner(System.in);
			System.out.print("How many rows do you want?: ");
			rows = amtRows.nextInt();
			for(i=1; i<=rows; i++)
			{
				for(space=1; space<=(rows-i); space++)
				{
					System.out.print("  ");
				}
				while(k != (2*i-1))
				{
					System.out.print(" *");
					k++;
				}
				k = 0;
				System.out.println();
			}
		}
	}
}
