public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n){

        int planted = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            try {
                if (i == 0 && flowerbed[0] == 0 && (flowerbed.length == 1 || flowerbed[1] ==0)) {planted++;i++;}
                else if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    planted++;
                    i++;
                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] != 1) {
                    planted++;
                    i++;
                }
            }catch (IndexOutOfBoundsException ex){}
        }
        return planted >= n;
    }



    /* ALTERNATE SOLUTION
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
		 if(n == 0) {
			 return true;
		 }
		 int count = 0;
	     for(int i =0;i<flowerbed.length;i++) {
	    	 if(flowerbed[i] == 0 && isAvailable(flowerbed, i) == true) {
	    		 flowerbed[i] = 1;
	    		 count++;
	    		 if(count == n) {
	    			 return true;
	    		 }
	    	 }
	     }
	     return false;
	    }


	 public boolean isAvailable(int[] flowerbed,int index) {
		 if((index-1>=0 && flowerbed[index-1] == 1) || (index+1<flowerbed.length && flowerbed[index+1] ==1)) {
			 return false;
		 }

		 return true;

	*ANOTHER SOLUTION WITH LOWER MEMORY CONSUMING
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean left= i==0|| flowerbed[i-1]==0;
                boolean right = i==flowerbed.length-1 || flowerbed[i+1]==0;

                if(right && left){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
        return count>=n;
    }
	 }*/
}
