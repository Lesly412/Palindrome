import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "*-* ";
        String header = "A Palindrome is a word or phrase which if reversed is same as Original ";
        System.out.println(s.repeat(header.length()-10));
        System.out.println("|");
        System.out.println("\t\t\t A Palindrome is a word or phrase which if reversed is same as Original \t\t\t");
        System.out.println("|");
        System.out.println(s.repeat(header.length()-10)+ "\n");

        System.out.println("Now let's detect if the word you have in mind is or is not a Palindrome\n");
        System.out.println("Please enter a String : ");
        Scanner scanner = new Scanner(System.in);

     String original = scanner.nextLine();
     original = original.replace(" " , ""); //This is to remove white spaces.
     String reverse = "";


     for (int i = original.length() -1; i >= 0; i--) {
         reverse += original.charAt(i); //copying up all the letters from the last to the first
     }
        System.out.println("The reverse of " + original + " is : " + reverse);
     boolean ispalindrome = true;
     for (int i = 0; i < original.length(); i++) {
         if (original.charAt(i) != reverse.charAt(i))
             ispalindrome = false;

        }
     if (ispalindrome)
         System.out.println("Yeh! This Is A Palindrome.");
     else
         System.out.println("Sorry, This is NOT a Palindrome");

    }


}
