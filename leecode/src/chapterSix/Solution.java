package chapterSix;

import java.util.Enumeration;
import java.util.Stack;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/8/28  10:51
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();//入栈的时候存储
    Stack<Integer> stack2 = new Stack<Integer>();//出栈的时候存储

    public void push(int node) {

        if (stack2.empty()){
            stack1.push(new Integer(node));
        }else {
            while (!stack2.empty()){
                stack1.push(new Integer(stack2.pop()));
            }
            stack1.push(new Integer(node));
        }

    }

    public int pop() {

        if (stack1.empty()){
          return   stack2.pop();
        }
        else {
            while (!stack1.empty()){
                stack2.push(new Integer(stack1.pop()));
            }
           return stack2.pop();
        }
    }

    public static void printStack(Stack<Integer> stack){
        if (stack.empty()){
            System.out.println("栈为空");

        }else {
            Enumeration enumeration = stack.elements();
            while (enumeration.hasMoreElements()){
                System.out.println(enumeration.nextElement());
            }
        }
    }

    public static void printStackByFor(Stack<Integer> stack){

        for(Integer i :stack){
            System.out.println(i);
        }
    }
}