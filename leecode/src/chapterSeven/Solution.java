package chapterSeven;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/28  17:14
 */

public class Solution {
    public int minNumberInRotateArray(int[] array) {

        if (array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i + 1] < array[i]) {
                return array[i + 1];
            }
        }
        return array[0];
    }
}
