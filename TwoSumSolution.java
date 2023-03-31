import java.util.Date;
import java.util.HashMap;

public class TwoSumSolution {
    public  int[] towSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }
    public int[] twoSumHashMap(int[] nums, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] answ = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target-nums[i])){
               answ[0] = i;
               answ[1] = hm.get(target-nums[i]);
            }else {
                hm.put(nums[i], i);
            }
        }
        return answ;
    }


}
