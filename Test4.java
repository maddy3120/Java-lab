import java.util.Scanner;
class Test4
{
public static void main(String args[])
{
try
{
int a=10,b=0;
if(b==0)
{
int c=a/b;
System.out.println(c);
throw new ArithmeticException("Division is not possible");

}

}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());

}
finally
{
System.out.print("End of the program");
}}}
