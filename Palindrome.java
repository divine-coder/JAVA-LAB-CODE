import java.util.Scanner;
 
class Palindrome
{
   public static void main(String args[])
   {
      String str, rev = "";
	  
      Scanner sc = new Scanner(System.in);
      System.out.println("\n Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
	  {
        rev = rev + str.charAt(i);
	  }
 
      if (str.equals(rev))
	  {
        System.out.println("\n Yes!!, " + str + " is a palindrome");
	  }
      else
	  {
        System.out.println("\n No!!," + str + " is not a palindrome");
	  }
   }
}
