import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
int i;
String pal="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter String: ");
String str=sc.nextLine();
for(i=str.length()-1;i>=0;i--)
{
pal+=str.charAt(i);
}
if(str.equals(pal))
{
System.out.println("The word is a palindrome");
}
else
{
System.out.println("The word is not a palindrome");
}
}
}
