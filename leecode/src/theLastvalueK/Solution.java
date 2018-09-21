package theLastvalueK;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/9/21  22:06
 */

/*智障题目*/
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {

        if (head == null) return null;
        if (k <= 0) return null;
        int temp = 1;
        ListNode tempNode = head;

        while (true) {
            if (head.next != null) {
                head = head.next;
                temp++;
                if (temp > k) {
                    tempNode = tempNode.next;
                }

            } else {
                break;
            }

        }
        if (temp < k) {
            return null;
        }
        System.out.println(temp);
        ;

        return tempNode;
    }

    public ListNode Reverse(ListNode head) {
        ListNode tempNode = new ListNode(3);
        ListNode tailNode = head;
        tempNode.val=head.val;
        tempNode.next=head.next;
        tailNode.val = 3;
        tempNode.val = 4;
        System.out.println("tailNode=====>" + tailNode.val + "\n" + "tempnode====>" + tempNode.val);

        tailNode.next = null;
/*
        while (head.next!=null){

            tempNode = head;
            tempNode.next = tailNode;
            tailNode = tempNode;
            head = head.next;
        }*/
        return head;
    }
}