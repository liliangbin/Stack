package pat.first;

import java.util.Scanner;

/**
 * @author liliangbin  dumpling1520@gmail.com
 * @date 2019/3/22  15:20
 **/
public class Main {

    // INFO  2019/3/22 15:20 liliangbin
    /*
    * 1001 A+B Format （20 分)
Calculate a+b and output the sum in standard format -- that is,
the digits must be separated into groups of three by commas
 (unless there are less than four digits).

Input Specification:*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a);
            System.out.println(b);
            long sum = a + b;
            boolean fu = sum >= 0;
            sum = Math.abs(sum);

            System.out.println("sum == >" + sum);
            String sumString = String.valueOf(sum);
            StringBuilder stringBuilder = new StringBuilder(sumString);
            for (int i = sumString.length(); i > 3; i = i - 3) {

                System.out.println(i + "====>i");
                stringBuilder.insert(i - 3, ",");

            }


            if (fu)
                System.out.println(stringBuilder.toString());
            else {
                System.out.println("-" + stringBuilder.toString());
            }

        }
    }


}
