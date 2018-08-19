package com.qipeng.solution.chapter1;

import java.util.Stack;

/**
 * Author  : qipenglin@meituan.com            <br/>
 * Date    : 2018/8/18                          <br/>
 * Time    : 下午11:40                          <br/>
 * ---------------------------------------    <br/>
 * Desc    :
 */
public class InverseStack<E> {

    public static void inverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Integer last = getAndRemoveLast(stack);
        inverseStack(stack);
        stack.push(last);
    }

    public static Integer getAndRemoveLast(Stack<Integer> stack) {
        Integer result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            Integer last = getAndRemoveLast(stack);
            stack.push(result);
            return last;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        inverseStack(stack);
        System.out.println(stack);
    }

}
