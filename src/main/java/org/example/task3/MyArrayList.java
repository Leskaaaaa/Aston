package org.example.task3;

import java.util.*;

public class MyArrayList<E> implements List<E> {
    private Object[] array;

    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENT = {};
    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.array = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.array = EMPTY_ELEMENT;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "
                    + initialCapacity);
        }
    }

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(Collection<? extends E> c) {
        Object[] a = c.toArray();
        if ((size = a.length) != 0) {
            if (c instanceof MyArrayList) {
                array = a;
            } else {
                array = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            array = EMPTY_ELEMENT;
        }
    }


    //////////////////////////////////////////////////////
    // Мои методы
    @Override
    public boolean addAll(Collection<? extends E> c) {
        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0) {
            return false;
        }
        Object[] elementData;
        final int s;
        if (numNew > (elementData = this.array).length - (s = size)) {
            array = Arrays.copyOf(this.array, s + numNew);
        }
        System.arraycopy(a, 0, elementData, s, numNew);
        size = s + numNew;
        return true;
    }

    @Override
    public boolean add(E item) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = item;
        return true;
    }

    public void add(int index, E item) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = item;
        size++;
    }

    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public boolean remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                array[i] = null;
                size--;
            }
        }
        return true;
    }

    @Override
    public E remove(int index) {
        Object item = array[index];
        array[index] = null;
        size--;
        return (E) item;
    }

    @Override
    public void clear() {
        size = 0;
        array = EMPTY_ELEMENT;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void sort(Comparator<? super E> c) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < size; i++) {
                if (c.compare(get(i - 1), get(i)) > 0) {
                    Object temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }


    //
    /////////////////////////////////////////////

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
