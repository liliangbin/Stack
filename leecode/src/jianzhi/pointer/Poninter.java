package jianzhi.pointer;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/20  15:46
 */
public class Poninter {

    String name;
    int age;

    public Poninter(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setlo(String lo){

        lo = lo.toUpperCase();
        System.out.println(lo);

    }

}
