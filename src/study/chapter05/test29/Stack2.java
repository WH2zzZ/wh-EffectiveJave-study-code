package study.chapter05.test29;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 参数化的栈(会造成堆污染(heap pollution))
 */
public class Stack2<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack2() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0){
            throw new EmptyStackException();
        }
        E result = elements[--size];
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