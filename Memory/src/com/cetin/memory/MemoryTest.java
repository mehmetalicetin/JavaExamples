package com.cetin.memory;

public class MemoryTest {
    public static void main(String[] args) {
        MemoryTest memoryTest = new MemoryTest();
        memoryTest.start();
    }

    private void start() {
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.println(container.getInitial());
    }

    private void another(Container initialHolder, String newInitial) {
        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Container initial2 = new Container();
        initialHolder = initial2;

        System.out.println(initialHolder.getInitial());
        System.out.println(newInitial);
    }
}
