package org.example;

import java.util.EmptyStackException;

@SuppressWarnings("unchecked")
public class Stack<T> {
    private static final int INITIAL_SIZE = 10;
    private T[] data;
    private int size;

    public Stack() {
        data = (T[]) new Object[INITIAL_SIZE];
    }

    public void push(T value) {
        checkAndExpand();
        data[size++] = value;
    }

    public T peek() {
        checkStackSize();
        return data[size - 1];
    }

    public T pop() {
        checkStackSize();
        T result = data[--size];
        data[size] = null;
        return result;
    }

    public int size() {
        return size;
    }

    private void checkAndExpand() {
        if (data.length == size) {
            int newSize = data.length + (data.length >> 1);
            T[] newData = (T[]) new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    private void checkStackSize() {
        if (size == 0) {
            throw new EmptyStackException();
        }
    }
}
