package jianzhi.chapterEight;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/28  17:23
 */
/*大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。*/
public class Solution {
    public int Fibonacci(int n) {

        int first = 1;
        int secnd = 1;
        int temp = 0;
        if (n==1||n==2){
            return 1;
        }
        if (n==0){
            return 0;
        }
        for (int i=2;i<n;i++){
            temp = first+secnd;
            first = secnd;
            secnd= temp;
        }
        return temp;
    }
}