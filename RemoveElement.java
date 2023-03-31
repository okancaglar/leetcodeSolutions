public class RemoveElement {
    public int removeElement(int[] nums, int val){
        int solution = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                int j = i+1;
                while (j< nums.length && nums[j] == val){
                    j++;
                }if (j< nums.length){
                    nums[i] = nums[j];
                    nums[j] = val;
                }else solution--;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        RemoveElement test = new RemoveElement();
        System.out.println(test.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }
}
