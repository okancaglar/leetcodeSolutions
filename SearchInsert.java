public class SearchInsert {

    public int searchInsert(int[] nums, int target){

        // O(n) time complexity
        int i = 0;
        while (i < nums.length && target > nums[i]){
            i++;
        }return i;
    }



    /* ANOTHER SOLUTION O(logn) time complexity
    public int searchInsert(int[] arr, int target) {
       int start=0;
       int end=arr.length-1;
       while(start<=end)
       {
           int mid=start+(end-start)/2;
           if(arr[mid]>target)
           {
               end=mid-1;
           }
           else if(arr[mid]<target)
           {
               start=mid+1;
           }
           else
           {
               return mid;
           }

       }
       return start;
    }*/


}
