package jianzhi.chapterTwo;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/19  12:14
 */
public class In {

    public static void main(String[] args) {
        int[][] arry = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {14, 7, 10, 13},
                {6, 8, 11, 15}
        };
        int target = 7;
        Solution solution = new Solution();
        System.out.println(solution.Find(target, arry));
    }
}
