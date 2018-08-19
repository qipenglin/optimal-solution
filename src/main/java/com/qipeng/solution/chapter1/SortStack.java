package com.qipeng.solution.chapter1;

import java.util.Stack;

/**
 * Author  : qipenglin@meituan.com            <br/>
 * Date    : 2018/8/19                          <br/>
 * Time    : 上午12:16                          <br/>
 * ---------------------------------------    <br/>
 * Desc    :
 */
public class SortStack {

    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            Integer cur = stack.pop();
            if (help.isEmpty() || cur < help.peek()) {
                help.push(cur);
            } else {
                while (!help.isEmpty() && help.peek() < cur) {
                    stack.push(help.pop());
                }
                help.push(cur);
            }
        }
        while(!help.isEmpty()){
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        sortStack(stack);
        System.out.println(stack);
    }



}
