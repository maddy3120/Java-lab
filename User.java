import java.util.*;
class User
{
 public static void main( String args[])
 {
 try
 {
 Scanner sc= new Scanner(System.in);
 System.out.println(" enter a number :");
 int n= sc.nextInt();
 int flag=0;
 for( int i=2;i<=n/2;i++)
 {
  if(n%i==0)
  {
   flag=1;
   break;
  }
  }
  if(flag==0)
  {
    throw new PrimeException("  a prime number");
  }
  else
  {
   System. out. println("not a prime");
  }
 
  }
 

   catch(PrimeException e)
   {
    System.out.println(e.getMessage());
   }
   
    finally
   {
    System.out.println(" end of program");
   
  }
 }
}
    class PrimeException extends Exception
     {
     private String message ;
     public  PrimeException ( String message )
     {
     this. message = message;
     }
     public String getMessage()
     {
     return message;
     }
     }





