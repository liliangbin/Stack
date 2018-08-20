package chapterFour;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/20  16:28
 */
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> arrayList= new ArrayList<>();

        while (listNode!=null){
            arrayList.add(listNode.val);
            listNode=listNode.next;
        }
        Collections.reverse(arrayList);//将这个链表的方向反一下。
        return arrayList;
    }
}