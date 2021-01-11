package chapter2.memoryLeak;

import java.util.Arrays;
import java.util.EmptyStackException;

//// Can you spot the "memory leak"?
public class Stack {
    private Object [] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object object){
        ensureCapacity();
        elements[size++] = object;
    }

    public Object pop() throws IllegalAccessException {
        /*if(size == 0)
            throw new EmptyStackException();
        return elements[--size];*/
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if(DEFAULT_INITIAL_CAPACITY == size)
            elements = Arrays.copyOf(elements, 2*size+1);
    }
}
