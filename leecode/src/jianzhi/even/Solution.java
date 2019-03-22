package jianzhi.even;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/9/21  13:35
 */
public class Solution {




    public  void reOrderArray(int[] array) {


        int[] temp = new int[array.length];

        int pinEv = 0;
        int pinQv = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 1) {
                temp[pinEv++] = array[i];
            } else array[pinQv++] = array[i];

        }
        for (int i = 0; i < pinQv; i++) {
            temp[pinEv++] = array[i];
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        for(int i=0;i<array.length;i++){
            array[i]=temp[i];
        }


    }
}