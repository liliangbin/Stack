package chapterFive;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/20  16:48
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        TreeNode treeNode = JointreeNode(pre, in);


        list(treeNode);
        System.out.println(treeNode.left.val+"====val");
        return
                treeNode;
    }

    public TreeNode JointreeNode(int[] pre, int[] in) {

        if (pre.length == 0) {
            return null;
        } else
            /*当他的数据长度为零的时候就是这个样子。*/ {
            int i = 0;
            TreeNode treeNode = new TreeNode(pre[0]);
            for (i = 0; i < in.length; i++) {
                if (in[i] == pre[0])
                    break;/*获取数据的位置*/
            }

            int[] inpre = new int[i];//获取长度
            int[] inin = new int[in.length - i - 1];//获取后半部分呢的长度

            System.arraycopy(in, 0, inpre, 0, i);

            System.arraycopy(in, i + 1, inin, 0, in.length - 1 - i);

            int[] prepre = new int[inpre.length];
            int[] prein = new int[inin.length];

            System.arraycopy(pre, 1, prepre, 0, inpre.length);
            System.arraycopy(pre, i + 1, prein, 0, inin.length);
            System.out.println("prepre====" + toStringMethod(prepre) + "   prein===" + toStringMethod(prein) + "  inpre====>" + toStringMethod(inpre) + "  inin====" + toStringMethod(inin));
            treeNode.left = JointreeNode(prepre, inpre);
            treeNode.right = JointreeNode(prein, inin);
            return treeNode;
        }
    }

    private static StringBuilder toStringMethod(int[] arr) {
        // 自定义一个字符缓冲区，
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        //遍历int数组，并将int数组中的元素转换成字符串储存到字符缓冲区中去
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                sb.append(arr[i] + " ,");
            else
                sb.append(arr[i] + " ]");
        }
        //   System.out.println(sb);
        return sb;
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
