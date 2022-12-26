class Solution {
    public double myPow(double x, int n) {
        boolean isNegative = false;
        if (n < 0) {
            x = 1 / x;
            isNegative = true;
            // 避免溢出，当为MIN_VALUE时，可以防止溢出
            n = -(n + 1);
        }

        double ans = 1;
        double tmp = x;

        while (n != 0) {
            if (n % 2 == 1) {
                ans *= tmp;
            }
            tmp *= tmp;
            n /= 2;
        }

        if (isNegative) {
            ans *= x;
        }

        return ans;
    }
}