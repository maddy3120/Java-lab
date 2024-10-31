import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
String rev=" ";
System.out.println("Enter String:");
String str=sc.nextLine();
for(i=str.length()-1;i>=0;i--)
{
rev+=str.charAt(i);
}
System.out.println("the reversed string is:"+rev);
}
}
