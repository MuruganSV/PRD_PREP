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

    public CustomArrayList(Collection c) {
        this.elements = new Object[c.size()];
        for(Object o: c) {
            elements[size]=o;
            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
    public Iterator<T> iterator() {
        return new CustomArrayIterator();
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
        c.forEach(v -> {
            elements[size]=v;
            size++;
        });
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        Object[] existingElements = new Object[size-index];

        final int[] k = {index};
        final int[] j = {0};

        // take the existing elements from the given index for shifting
        for(int i=index;i<size;i++) {
            existingElements[j[0]] = elements[i];
            j[0]++;
        }


        // keep the new elements from the mentioned index
        c.forEach(v -> {
            elements[k[0]] = v;
            k[0]++;
            size++;
        });

        // keep the existing elements in shifted place
        for(Object ele: existingElements) {
            elements[k[0]] = ele;
            k[0]++;
        }
        return true;
    }

    @Override
    public void clear() {
        this.elements = new Object[DEFAULT_CAPACITY];
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
    public ListIterator<T> listIterator() {
        return new CustomArrayListIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return new CustomArrayListIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // Exclusive of toIndex. i.e: [10,20,30,40,50] from 1 to 3 is [20,30]
        List<T> subListElements = new CustomArrayList<>(toIndex-fromIndex);
        for(int i=fromIndex;i<toIndex;i++) {
            subListElements.add((T) elements[i]);
        }
        return subListElements;
    }

    @Override
    public boolean retainAll(Collection c) {
        Object[] existingElements = elements;

        this.clear();

        c.forEach(v -> {
            for(int i=0;i<existingElements.length;i++){
                if(existingElements[i] == v) {
                    elements[size] = v;
                    size++;
                }
            }
        });
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        Object[] finalElements = new Object[DEFAULT_CAPACITY];

        int[] index = {0};

        for(int i=0; i<size;i++) {
            if(elements[i] !=null && !c.contains(elements[i])) {
                finalElements[index[0]] = elements[i];
                index[0]++;
            }
        }

        size = index[0];
        elements = finalElements;

        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean isNotMatching = false;
        for(Object v: c) {
            for (Object ele : elements) {
                if (ele !=null && !ele.equals(v)) {
                    isNotMatching = true;
                    break;
                }
            }

            if(isNotMatching) {
                break;
            }
        }
        return !isNotMatching;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private class CustomArrayIterator implements Iterator<T> {

        private int cursor = 0;

        public CustomArrayIterator() {}

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T) elements[cursor++];
        }

        @Override
        public void remove() {
            CustomArrayList.this.remove(cursor-1);
        }
    }

    private class CustomArrayListIterator implements ListIterator<T> {
        private int cursor = 0;

        public CustomArrayListIterator(int index) {
            this.cursor = index;
        }

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T) elements[cursor++];
        }

        @Override
        public boolean hasPrevious() {
            return cursor > -1;
        }

        @Override
        public T previous() {
            if(!hasPrevious()) {
                throw new NoSuchElementException();
            }
            return (T) elements[cursor--];
        }

        @Override
        public int nextIndex() {
            return cursor+1;
        }

        @Override
        public int previousIndex() {
            return cursor-1;
        }

        @Override
        public void remove() {
            CustomArrayList.this.remove(cursor-1);
        }

        @Override
        public void set(T t) {
            CustomArrayList.this.set(cursor-1, t);
        }

        @Override
        public void add(T t) {
            CustomArrayList.this.add(cursor-1, t);
        }
    }
}
