package com.qipeng.solution.chapter1;

import java.util.Stack;

/**
 * Author  : qipenglin@meituan.com            <br/>
 * Date    : 2018/8/18                          <br/>
 * Time    : 下午11:10                          <br/>
 * ---------------------------------------    <br/>
 * Desc    :
 */
public class MinStack extends Stack<Integer> {

    private Stack<Integer> minStack;

    @Override
    public Integer push(Integer item) {
        if (minStack.empty() || minStack.peek() > item) {
            minStack.push(item);
        } else {
            minStack.push(minStack.peek());
        }
        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        minStack.pop();
        return super.pop();
    }

    public Integer getMin() {
        return minStack.peek();
    }
}
