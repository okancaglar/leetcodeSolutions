import java.util.ArrayList;

public class AddBinary {
    public String addBinary(String a, String b){

        StringBuilder solution = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;

        String[] aArr = a.split("");
        String[] bArr = b.split("");

        int carry=0;

        while (i>-1 || j > -1){
            int sum = carry;

            if(i>-1){
                sum += Integer.parseInt(aArr[i]);
            }if (j>-1){
                sum+=Integer.parseInt(bArr[j]);
            }
            carry = sum>1?1:0;
            solution.append(sum % 2);
            i--;j--;
        }if (carry>0) solution.append(carry);
        String sol = String.valueOf(solution.reverse());
        return sol;
    }

    public static void main(String[] args) {
        AddBinary test = new AddBinary();
        System.out.println(test.addBinary("11","1"));
    }

    /* ALTERNATE SOLUTION
    public String addBinary(String a, String b) {
        StringBuilder output = new StringBuilder();
        int aPos = a.length() - 1;
        int bPos = b.length() - 1;
        int carry = 0;
        while(aPos > -1 && bPos > -1) {
            if(a.charAt(aPos) != b.charAt(bPos)) {
                if(carry != 0) {
                    output.append('0');
                } else {
                    output.append('1');
                }
            } else if(a.charAt(aPos) == '0') {
                if(carry != 0) {
                    output.append('1');
                    carry = 0;
                } else {
                    output.append('0');
                }
            } else {
                if(carry != 0) {
                    output.append('1');
                } else {
                    output.append('0');
                    carry = 1;
                }
            }
            aPos--;
            bPos--;
        }
        if(a.length() == b.length()) {
            if(carry != 0) {
                output.append('1');
            }
            return output.reverse().toString();
        } else if (a.length() > b.length()){

            while(aPos > -1) {
                if(carry != 0) {
                    if(a.charAt(aPos) == '0') {
                        output.append('1');
                        carry = 0;
                    } else {
                        output.append('0');
                    }
                } else {
                    output.append(a.charAt(aPos));
                }
                aPos--;
            }
            if(carry != 0) {
                output.append('1');
            }
            return output.reverse().toString();
        } else {
            while(bPos > -1) {
                if(carry != 0) {
                    if(b.charAt(bPos) == '0') {
                        output.append('1');
                        carry = 0;
                    } else {
                        output.append('0');
                    }
                } else {
                    output.append(b.charAt(bPos));
                }
                bPos--;
            }
            if(carry != 0) {
                output.append('1');
            }
            return output.reverse().toString();
        }
    }
    */
}
