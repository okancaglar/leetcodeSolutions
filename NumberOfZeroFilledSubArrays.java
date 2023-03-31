public class NumberOfZeroFilledSubArrays {
    public long zeroFilledSubarray(int[] nums){

        long counter = 0;
        int i;
        for (i = 0; i < nums.length - 1;i++) {
            if(nums[i] == 0) {
                int j = i;
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }
                counter = (long) (Math.pow(2,--j) -2);
                i = j - 1;
            }
        }
        if (nums[i] == 0) counter++;
        return counter;




    }

}
