package patterns;

public class Pattern15 
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=n-i;k++)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}