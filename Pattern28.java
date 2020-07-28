package patterns;

public class Pattern28 
{
	public static void main(String args[])
	{
		int n=4,x=1;
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(x);
				x++;
			}
			System.out.println();
		}
	}

}
