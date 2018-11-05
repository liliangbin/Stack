package tree;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/5  19:34
 */
public class TreeMain {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        node.val = 1;
        node.right = new TreeNode(2);
        node.left = new TreeNode(3);
        node.right.right = new TreeNode(4);

        node.right.left = new TreeNode(5);
        node.left.left = new TreeNode(6);
        node.left.right = new TreeNode(7);

        Solution solution = new Solution();
        solution.list(node);
        solution.Mirror(node);
    }

}
