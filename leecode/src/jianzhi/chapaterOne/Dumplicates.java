package jianzhi.chapaterOne;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/10  14:35
 */
public class Dumplicates {

    public   int removeDuplicates(int[] nums) {


        int n = nums.length;//当数据长度大于等于2的时候才会有出现重复的情况
        if (n >= 2) {
            int  head = 0;
            int tail = 1;
            while (true) {

                if(head>=nums.length||tail>=nums.length){
                    break;
                }

                if (nums[head] == nums[tail]){
                    System.out.println("head == "+head+"  ===>tail ==" + tail+"   nums[head]==>"+nums[head] );
                    tail++;
                }
                else {

                    nums[++head] = nums[tail++];
                    System.out.println("head == "+head+"  ===>tail ==" + tail+"   nums[head]==>"+nums[head] );

                }
            }
           for (int x=0;x<head+1;x++){
               System.out.println(nums[x]);
           }
            return head +1;
        }
        for (int x=0;x<nums.length;x++){
            System.out.println(nums[x]);
        }
        return nums.length;
    }
}
