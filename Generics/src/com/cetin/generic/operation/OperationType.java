package com.cetin.generic.operation;

public enum OperationType {
    ADD((short)1,new Addition());

    OperationType(short line ,IOperation operation) {
        this.line= line;
        this.operation = operation;
    }

    private IOperation operation;
    private short line;

    public <T extends IOperation> T getOperation() {
        return (T) operation;
    }

    public short getLine() {
        return line;
    }
}
