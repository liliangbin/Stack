package tree;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/10/5  10:36
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {

        return true;
    }


    public void Mirror(TreeNode root) {

        if (root==null){
            return;
        }
        TreeNode node = Mirr(root, new TreeNode(0));

        root.val = node.val;
        root.left = node.left;
        root.right = node.right;

        list(root);
    }


    public TreeNode Mirr(TreeNode root, TreeNode head) {


        if (root == null) {
            return null;
        }

        head.left = Mirr(root.right, new TreeNode(0));
        head.val = root.val;
        head.right = Mirr(root.left, new TreeNode(0));
        return head;
    }


    void list(TreeNode treeNode) {
        if (treeNode == null) {
            System.out.println(" kong ");
        } else {

            System.out.println(treeNode.val);
            list(treeNode.left
            );
            list(treeNode.right);
        }
    }

}