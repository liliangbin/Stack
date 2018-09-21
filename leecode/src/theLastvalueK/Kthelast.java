package theLastvalueK;

import java.net.Socket;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/9/21  22:23
 */
public class Kthelast {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(-1);
        ListNode head = listNode;
        for (int i=0;i<5;i++){
            listNode.next = new ListNode(i);
            listNode = listNode.next;
        }

        Solution solution = new Solution();
       ListNode listNode1 =  solution.FindKthToTail(head,7);
        //System.out.println(listNode1.val);


        ListNode listNode2 = new ListNode(45);
        solution.Reverse(listNode2);
    }
}
