package pointer;

import chapterTwo.In;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/20  16:05
 */
public class InNode {

    public int info;
    public InNode next;

    public InNode(int i) {
        this(i, null);
    }

    public InNode(int i, InNode n) {
        this.info = i;
        this.next = n;
    }


}
