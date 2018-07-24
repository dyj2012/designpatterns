package com.duyj.designpatterns.behavior.twoclass.iterator;

import java.util.Iterator;

/**
 * 手写集合
 *
 * @author 杜永军
 * @date 2018/07/19
 */
public class MyList<T> implements Iterable<T> {
    private Object[] elements;
    private int size;

    public MyList(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    public void add(T t) {
        if (size >= elements.length - 1) {
            throw new RuntimeException("capacity is over!");
        }
        elements[size] = t;
        size++;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        int cursor;

        @Override
        public boolean hasNext() {
            cursor++;
            return size > cursor;
        }

        @Override
        public T next() {
            return (T) elements[cursor - 1];
        }
    }
}
