import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings){
        String answ = "";
        int i = 0;
        while (i>=0){
            try {
                int j = 0;
                for (; j < strings.length-1; j++) {
                    if (strings[j].charAt(i) != strings[j + 1].charAt(i)){
                        return answ;
                    }
                }
                answ = answ.concat(String.valueOf(strings[j].charAt(i)));
                i++;
            }catch (Exception e){
                return answ;
            }
        }return answ;
    }
    /*public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }*/


}
