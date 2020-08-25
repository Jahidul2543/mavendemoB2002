package problem_solving;
import java.util.Scanner;

public class DemoPalindrome {


    public static boolean isPalindrome(String word) {
        // Please write your code here.
        String reverseString = "";
        int length =  word.length();
        for(int i =length-1; i>=0; i--){
            reverseString = reverseString + word.charAt(i);
        }
        boolean result;
        if(word.equalsIgnoreCase(reverseString)){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println(isPalindrome(word));
    }
}
