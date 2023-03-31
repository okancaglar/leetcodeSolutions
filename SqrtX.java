public class SqrtX {
    public int mySqrt(int x){
        if (x == 0 || x == 1) return x;
        else {
            //Newton's Method
            double xi = x;
            double xi2 = (xi + x/xi)/2;
            while ((int) xi != (int) xi2){
                xi = xi2;
                xi2 = (xi2 + x/xi2)/2;
            }
            return (int)xi;
        }
    }
    /* ALTERNATE SOLUTION
    public int mySqrt(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }*/
}
