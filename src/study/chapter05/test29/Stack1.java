package study.chapter05.test29;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 没有参数化的栈
 */
public class Stack1 {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack1() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0){
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        //清除没用的引用
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}