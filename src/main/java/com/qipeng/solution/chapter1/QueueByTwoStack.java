package com.qipeng.solution.chapter1;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Author  : qipenglin@meituan.com            <br/>
 * Date    : 2018/8/18                          <br/>
 * Time    : 下午11:21                          <br/>
 * ---------------------------------------    <br/>
 * Desc    :
 */
public class QueueByTwoStack<E> {

    private Stack<E> stack1;

    private Stack<E> stack2;

    public  QueueByTwoStack () {
        stack1 = new Stack<E>();
        stack2 = new Stack<E>();
    }

    public void add(E e) {
        stack1.push(e);
    }

    public E poll() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        if (stack1.isEmpty()) {
            throw new NoSuchElementException();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public E peek() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        if (stack1.isEmpty()) {
            throw new NoSuchElementException();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
}
