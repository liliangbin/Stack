package chapaterTen;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/29  14:52
 */
public class Solution {

    /*
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     */

    public int NumberOf1(int n) {

        int index = 1;
        int number = 0;
        while (index != 0) {
            if ((n & index) != 0) {
                number++;
            }
            index = index << 1;
        }

        return number;
    }

    public static void main(String[] args) {
        double base = 2;
        int exponent = 3;
        double test = base;

        for (int i = 1; i < exponent; i++) {
            test = (((test * 100) * (base * 100)) / (100 * 100));
        }


    }

    public double Power(double base, int exponent) {

                double test = base;

                for (int i = 1; i < exponent; i++) {
                    test = (((test * 100) * (base * 100)) / (100 * 100));
                }
                return test;

    }
}

