public class FirstOccurrence {
    public int strStr(String haystack, String needle){

        char[] bigArr = haystack.toCharArray();
        char[] smallArr = needle.toCharArray();

        for (int i = 0; i < bigArr.length; i++) {
            if (bigArr[i] == smallArr[0]){
                int j;
                for (j = 1;  j< smallArr.length ; ++j) {
                    try {
                        if (bigArr[i+j] != smallArr[j]) break;
                    }catch (IndexOutOfBoundsException e){return -1;}
                }if (j == smallArr.length) return i;
            }
        }
        return -1;
    }


    /* ALTERNATE SOLUTION

      public int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    }

    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      if (haystack.substring(i, i + needle.length()).equals(needle)) {
        return i;
      }
    }
    return -1;
  }
    */
}
