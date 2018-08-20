package pointer;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/20  15:47
 */
public class UserPointer {

    public static void main(String[] args) {
        Poninter poninter = new Poninter("liliangibn",23);


        Poninter poninter1 = poninter;
        poninter1.name = "fsdfs";
        System.out.println(poninter.name);

        //Java种的对象是一种引用，我们使用的是他的指针。对象的复用。

        String lo = "inasdfsdga";
        poninter.setlo(lo);
        System.out.println(lo);

        InNode inNode = new InNode(10);
        inNode.next = new InNode(13);


    }
}
