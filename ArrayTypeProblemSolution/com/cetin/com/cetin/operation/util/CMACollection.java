package com.cetin.com.cetin.operation.util;

import java.util.Arrays;

//CustomCollection
public class CMACollection {
    private Object[] objArray = new Object[10];
    private int elementCount = 0;

    public int size() {
        return elementCount;
    }

    public int capacity() {
        return objArray.length;
    }

    public void add(Object obj) {
        if (objArray.length == elementCount) {
            increaseCapacity();
        }
        objArray[elementCount] = obj;
        elementCount++;
    }

    private void increaseCapacity() {
        Object[] nextArray = new Object[objArray.length * 2];
        for (int i = 0; i < objArray.length; i++) {
            nextArray[i] = objArray[i];
        }
        objArray = nextArray;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index +" + index);
        }
        return objArray[index];
    }

    public void replace(int index, Object obj){
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index +" + index);
        }
        objArray[index] = obj;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()-1) {
            throw new IndexOutOfBoundsException("index +" + index);
        }
        while (index <= size() - 1) {
            objArray[index] = objArray[index+1];
            index++;
        }
        elementCount--;
    }

    public void insert(int index, Object obj){
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index +" + index);
        }
        if(capacity() == size()){
            increaseCapacity();
        }
        for (int i= size()-1 ; i >= index ;i--){
            objArray[i+1] = objArray[i];
        }
        objArray[index] = obj;
        elementCount++;
    }

    @Override
    public String toString() {
        return "CMACollection{" +
                "objArray=" + Arrays.toString(objArray) +
                ", elementCount=" + elementCount +
                '}';
    }
}
