import java.util.Scanner;
class transpose
{
  public static void main(String args[])
  { 
  int m,n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the rows of the matrix:");
  m=sc.nextInt();
  System.out.println("Enter the columns of the matrix:");
  n=sc.nextInt();
  int a[][]=new int[m][n];
  System.out.println("Enter the elements of the matrix: ");
  for(int i=0;i<m;i++)
  {
	for(int j=0;j<n;j++)
	  {  
	      a[i][j]=sc.nextInt();
      }
	}
	int b[][]=new int[n][m];
   for(int i=0;i<m;i++)
    {
	      for(int j=0;j<n;j++)
		  {
		     b[j][i]=a[i][j];
		     System.out.print(a[i][j]);
			 }
			 System.out.print("\n");
     }
	 System.out.println("the transposed matrix is");
	 for(int i=0;i<n;i++)
    {
	      for(int j=0;j<m;j++)
		  {      
		    System.out.print(b[i][j]+" ");
			}
			System.out.println();
			}
		}
}
		     
	 
