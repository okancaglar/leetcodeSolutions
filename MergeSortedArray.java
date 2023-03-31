public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n ) {
        int[] temp = new int[m+n];
        int i = 0, j=0,k=0;

        while(i<m && j<n){
            if (nums1[i] < nums2[j]){
                temp[k] = nums1[i];
                i++;
            }else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }while (i<m){
            temp[k] = nums1[i];
            i++;k++;
        }while(j<n){
            temp[k] = nums2[j];
            j++;k++;
        }
        for (int l = 0; l < temp.length; l++) {
            nums1[l] = temp[l];
        }
    }
}
