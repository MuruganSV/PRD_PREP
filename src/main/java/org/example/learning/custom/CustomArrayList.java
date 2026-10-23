package org.example.learning.custom;

import java.util.*;

public class CustomArrayList<T> implements List<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private static int CUSTOM_CAPACITY = 0;

    private static final Object[] EMPTY_ELEMENT = {};

    transient Object[] elements;

    private int size = 0;

    public CustomArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int customSize) {
        this.elements = new Object[customSize];
        CUSTOM_CAPACITY = customSize;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object ele: elements) {
            if(ele.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsIgnoreCase(Object o) {
        for (Object ele: elements) {
            if(o instanceof String && ele instanceof String) {
                if(ele.toString().equalsIgnoreCase(o.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return Arrays.stream(elements).iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (size < DEFAULT_CAPACITY || size < CUSTOM_CAPACITY){
            elements[size] = o;
        } else {
            return false;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for(int i=0; i<size; i++) {
            if(elements[i].equals(o)) {
                for(int j=i; j<size-1; j++) {
                    for(int k=j+1; k<=j+1; k++) {
                        elements[j]=elements[k];
                    }
                }
                elements[size-1] = '\0';
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        this.elements = EMPTY_ELEMENT;
        size = 0;
    }

    @Override
    public T get(int index) {
        return (T) elements[index];
    }

    @Override
    public Object set(int index, Object element) {
        Object existingElement = elements[index];
        elements[index] = element;
        return existingElement;
    }

    @Override
    public void add(int index, Object element) {
        for(int i=index; i<size;i++) {
            Object existingElement = elements[i];
            elements[i] = element;
            element = existingElement;
        }
        elements[size]=element;
        size++;
    }

    @Override
    public T remove(int index) {
        T element = (T) elements[index];
        for(int j=index; j<size-1; j++) {
            for(int k=j+1; k<=j+1; k++) {
                elements[j]=elements[k];
            }
        }
        elements[size-1] = '\0';
        size--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        for(int i=0;i<size;i++) {
            if(elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastindex = -1;
        for(int i=0;i<size;i++) {
            if(elements[i].equals(o)) {
                lastindex = i;
            }
        }
        return lastindex;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
