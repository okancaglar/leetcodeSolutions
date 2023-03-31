import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s){
        HashMap<Character, Integer> hmRoman = new HashMap<>();
        hmRoman.put('I',1);
        hmRoman.put('V',5);
        hmRoman.put('X',10);
        hmRoman.put('L',50);
        hmRoman.put('C',100);
        hmRoman.put('D',500);
        hmRoman.put('M',1000);

        int number = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (hmRoman.get(s.charAt(i)) < hmRoman.get(s.charAt(i+1))){
                number -= hmRoman.get(s.charAt(i));
            }else number += hmRoman.get(s.charAt(i));
        }
        number += hmRoman.get(s.charAt(s.length()-1));
        return number;
    }
    /*
     public int romanToInt(String s) {
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

     */

}
