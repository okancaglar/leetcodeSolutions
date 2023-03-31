public class LengthOfLastWord {
    public int lengthOfLastWord(String s){
        String[] strArr = s.split(" ");
        return strArr[strArr.length-1].length();
    }

    public static void main(String[] args) {
        LengthOfLastWord test = new LengthOfLastWord();
        System.out.println(test.lengthOfLastWord("   fly me   to   the moon     "));
    }
    /* ALTERNATE SOLUTION
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        while(s.charAt(end) == ' ') {
            end--;
        }

        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;
    }*/
}
