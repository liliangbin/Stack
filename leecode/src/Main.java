import java.util.Stack;

import static jianzhi.chapterSix.Solution.printStack;
import static jianzhi.chapterSix.Solution.printStackByFor;

public class Main {

    public static void main(String[] args) {
/*

        Dumplicates dumplicates = new Dumplicates();
        int [] nums = {1,34,4,4,2};
        dumplicates.removeDuplicates(nums);
        System.out.println("Hello World!");
*/

        Stack<Integer> stack = new Stack<>();
        stack.push(new Integer(1));
        stack.push(new Integer(2));
        stack.push(new Integer(3));
        stack.push(new Integer(4));

        printStack(stack);
        int tezt = stack.pop();
        System.out.println(tezt + "pop()");
        printStackByFor(stack);


    }
}
