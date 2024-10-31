import java.util.Scanner;
class matrixmul
{
	public static void main(String args[])
	{
		int m1,n1,m2,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns of matrix 1");
		m1=sc.nextInt();
		n1=sc.nextInt();
		int a[][]=new int[m1][n1];
		System.out.println("Enter the rows and columns of matrix 2");
		m2=sc.nextInt();
		n2=sc.nextInt();
		int b[][]=new int[m2][n2];
		System.out.println("Enter the elements of matrix 1");
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix 2");
		for(int i=0;i<m2;i++)
		{
			for(int j=0;j<n2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[m1][n2];
		if (n1==m2)
		{
			for(int i=0;i<m1;i++)
			{
				for(int j=0;j<n2;j++)
				{
					c[i][j]=0;
					
				
						c[i][j]=c[i][j]+(a[i][j]*b[i][j]);
						System.out.println(c[i][j]+" ");
				}
				System.out.print("\n");
				}
			}
		}
	}

