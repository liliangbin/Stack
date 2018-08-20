package chapaterOne;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/10  14:21
 */
public class Nums {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 5, 5, 6};
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] nums3 = {1, 2};
        int[] nums4 = {1, 2, 3, 4, 5, 5};
        int[] nums5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] test = {{1}, {}, {1, 2}, {1, 2, 3, 4, 5, 5}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

        };

        for (int i = 0; i < 5; i++) {

            Dumplicates dumplicates = new Dumplicates();

            System.out.println("=====>" + dumplicates.removeDuplicates(test[i]));
        }

    }


}
