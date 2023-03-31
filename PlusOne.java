public class PlusOne {
    public int[] plusOne(int[] digits){
        //increment last index of array
        //if there is 9 then add +1 to index-1
        //you have to check 9 is still going ex 9
        //lead number 9 and still carry you have to extend array plus one

        int sum = 0;
        int carry = 0;

        sum = digits[digits.length-1] + 1;
        if (sum>=10){
            digits[digits.length-1] = sum%10;
            carry = 1;
        }else {
            digits[digits.length-1] = sum;
        }
        int i = digits.length-2;
        while (i>-1 && carry ==1){
            sum = digits[i] + carry;
            if (sum >= 10){
                digits[i] = sum%10;
                carry=1;
            }else {
                digits[i] = sum;
                carry=0;
            }
            i--;
        }if (carry ==1){
            int[] solution = new int[digits.length+1];
            solution[0] = 1;
            for (int j = 0; j < digits.length; j++) {
                solution[j+1] = digits[j];
            }return solution;
        }else
            return digits;
    }

    public static void main(String[] args) {
        PlusOne test = new PlusOne();
        int[] test1Case = test.plusOne(new int[]{9,9});
        for (int a:
             test1Case) {
            System.out.print(a);
        }
    }
    /*
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
    }

    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
    */
}
