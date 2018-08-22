package chapterFive;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/22  11:23
 */
public class Index {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        solution.reConstructBinaryTree(pre, in);
    }
}
