package patterns;

public class Pattern18 
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int k=1;k<=n-i;k++)
			 System.out.print(" ");
				for(int j=n-i;j<=n;j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}
