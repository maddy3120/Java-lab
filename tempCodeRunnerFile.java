import java.util.Scanner;

public class Testing 
{
    public static void main(String[] args) 
    {
        int i;
        String word="";
        String ch="";
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        word=sc.nextLine();
        System.out.println("Enter the letter to find frequency:");
        ch=sc.nextLine();
        for(i=0;i<word.length();i++)
        {
            if(word.toLowerCase().equals(ch.toLowerCase()))
            {
                count++;
            }

        }
        System.out.println("Frequency of " + ch + " is:" + count);
    }   
}
