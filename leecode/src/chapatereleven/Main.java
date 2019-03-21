package chapatereleven;

import chapterTwo.In;

import java.util.ArrayList;

/**
 * @author liliangbin  dumpling1520@gmail.com
 * @date 2019/3/21  8:11
 **/
public class Main {

    // INFO  2019/3/21 8:11 liliangbin  输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
    // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
    // 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.


    public ArrayList<Integer> printMatrix(int[][] matrix) {

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int boom = matrix.length - 1;

        ArrayList<Integer> arrayList = new ArrayList<>();
        while ((right > left) && boom > top) {

            for (int i = left; i <= right; i++) {
                arrayList.add(matrix[top][i]);

            }

            for (int j = top + 1; j <= boom; j++) {
                arrayList.add(matrix[j][right]);
            }
            for (int i = right - 1; i >= left; i--) {
                arrayList.add(matrix[boom][i]);
            }

            for (int j = boom - 1; j > top; j--) {
                arrayList.add(matrix[j][left]);

            }
            boom--;
            top++;
            left++;
            right--;
        }

        if (boom == top && left < right) {
            for (int i = left; i <= right; i++) {
                arrayList.add(matrix[top][i]);
            }
        }
        if (left == right && top < boom) {
            for (int i = top; i <= boom; i++) {
                arrayList.add(matrix[i][left]);
            }
        }
        if (boom == top && left == right) {
            arrayList.add(matrix[left][boom]);

        }

        return arrayList;
    }

}
