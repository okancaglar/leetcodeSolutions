import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public  static boolean isPalindrome(int x){

        String number = String.valueOf(x);

        char[] intChar = number.toCharArray();
        char[] reverse = number.toCharArray();

        boolean flag = true;
        for (int i = 0; i < intChar.length; i++) {
            if (intChar[i] != reverse[(intChar.length-1)-i]){
                flag = false;
            }
        }
        return flag;
    }
    /*
    *alternate sol
    * public boolean isPalindrome(int x) {
      String s = String.valueOf(x);

        int i = 0;
        int j = s.length() - 1;

          while(i <= j)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;

    }
    * */

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
