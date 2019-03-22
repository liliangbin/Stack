package jianzhi.chapterTen;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/10/4  20:24
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 */
public class Solution {

    public ListNode Merge(ListNode list1, ListNode list2) {

        ListNode listNode = new ListNode(0);
        ListNode listTail = listNode;
        while (list1 != null && list2 != null) {

            if (list1==null){
                System.out.println("list === null");
            }
            if (list1.val < list2.val) {

                ListNode temp = new ListNode(list1.val);
                listTail.next = temp;
                listTail = listTail.next;
                list1 = list1.next;
            } else {
                ListNode temp = new ListNode(list2.val);
                listTail.next = temp;
                listTail = listTail.next;
                list2 = list2.next;
            }

        }
        if (list1 != null) {
            listTail.next = list1;
        } else {
            listTail.next = list2;
        }

        return listNode.next;
    }
}
