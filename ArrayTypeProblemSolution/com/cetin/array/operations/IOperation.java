package com.cetin.array.operations;

public interface IOperation<T> {
    void doOperation() throws Exception;
    void preOperation(Object [] numbers) throws Exception;
}
