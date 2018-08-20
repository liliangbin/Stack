package chapterThree;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @]date 2018/8/19  14:18
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {

        String str1=str.toString();
        String str2=str1.replace(" ","%20");
        System.out.println(str2);
        return str2;
    }
}