package chapterNine;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/28  17:44
 */
public class Solution {
    public int JumpFloor(int target) {

        int total = 0;
        total = jump(target);
        return total;
    }

    public int jump(int target) {

        int step = 0;
        int twoStep = 0;
        int temp1 = 0, temp2 = 0;

        if (target == 0) {
            return 1;
        } else if (target < 0) {
            return 0;
        } else {
            step = jump(target - 1);
            twoStep = jump(target - 2);
        }
        return step + twoStep;
    }/*刚发现了另外一种解法，使用得是斐波拉且数列*/


    /*i个阶梯得跳的方法总是来自于前i-1  i-2种，所以我们只用考虑他对的前几种解法 */
}