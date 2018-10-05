package chapterTen;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/10/4  20:38
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        ListNode listNode = solution.Merge(list1,list2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode= listNode.next;
        }

    }
}
