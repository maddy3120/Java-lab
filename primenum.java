import java.util.Scanner;
class primenum
{
    public static void main(String args[])
{
int i,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
if(n==1&&n==0)
{
    flag=0;
}
else 
{
    for(i=1;i<=n/2;i++)
{
    if(n%i==0)
{
    flag=1;  
}
else
{
flag=0;
}
}
}
if (flag==0)
{
    System.out.println(n+" is prime");
}
else
{
System.out.println(n+" is not prime");
}
}
}