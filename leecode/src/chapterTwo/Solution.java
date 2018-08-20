package chapterTwo;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/19  9:59
 */
public class Solution {
    public boolean Find(int target, int[][] array) {

        int low = 1;
        int high = array[0].length;
        for (int i = 0; i < array.length; i++) {

            if (array[i][0] == target) {
                return true;
            }

            if (array[i][0] < target&&array[i][high-1]>=target) {
                return test(target, array, low, high, i);
            }

            if (array[i][0] > target) {
                return false;
            }
        }

        return false;
    }

    private boolean test(int target, int[][] array, int low, int high, int lo) {
        int middle = (high + low) / 2;
        System.out.println("high =="+high+"   ====low====>"+low+"  ====>middle====>"+middle);
        while (true) {

            if (low > high) {
                return false;
            }

            System.out.println(middle + "====>midldle");
            if (target == array[lo][middle]) {

                return true;
            }

            if (target > array[lo][middle]) {
                low = middle + 1;
            }
            if (target < array[lo][middle]) {
                high = middle - 1;
            }

            middle = (low + high) / 2;

        }
    }
}