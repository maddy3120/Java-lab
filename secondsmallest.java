import java.util.Scanner;
class secondsmallest 
{
public static void main(String args[])
{
int n,temp=0;
Scanner sc =new Scanner(System.in);
System.out.println("enter size of the array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements");
for(int i=0;i<n;i++)
{
 a[i]=sc.nextInt();
 }
 for(int i=0;i<n-1;i++)
   {    
        for(int j=0;j<n-1;j++)
		{   
		if(a[j]>a[j+1])
		{
		   temp=a[j];
		   a[j]=a[j+1];
		   a[j+1]=temp;
		   }
	}	   
}
System.out.println("sorted array");
System.out.println("second smallest element in the array is:"+a[1]);
}	
}
