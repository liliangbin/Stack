package theLastvalueK;

import java.util.List;
import java.util.Stack;

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

            ListNode newList = null;
            if (head==null || head.next ==null)
                return head;
            while (head!=null){
                ListNode temp = head.next;
                head.next = newList;
                newList = head;
                head = temp;
            }
            return newList;
        }



}