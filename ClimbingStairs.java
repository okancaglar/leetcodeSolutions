import java.lang.reflect.Array;
import java.math.BigInteger;

public class ClimbingStairs {
    public int climbStairs(int n){
        int x = n/2;
        int y = n%2;
        int result=0;

        while (x >= 0){
            result += (factorial(x+y).divide(factorial(x).multiply(factorial(y)))).intValue();
            x--;
            y = y + 2;
        }
        return result;
    }
    public BigInteger factorial(int x){
        BigInteger result= new BigInteger("1");

        for (int i = 2; i <= x ; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result;
    }
    /* Alternate solution
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }*/
}