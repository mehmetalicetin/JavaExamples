package com.cetin.producer;

public class StringProducerMain {
    public static void main(String[] args) {
        new StringProducerMain().run();
    }

    public static String getName(){
        return "Ali-static";
    }
    private void run() {
        String name = "Ali-Veli";
        displaySettings(()->"Ali"); //
        displaySettings(StringProducerMain::getName); //Refer to a static method using ClassName::methodName, e.g. String::format, Integer::max.
        displaySettings(name::toString);//particular object. instanceRef::methodName
        displaySettings(()->toString());//Method from superclass
        displaySettings(this::toString); //Method from superclass
    }

    private void displaySettings(com.cetin.producer.Producer producer) {
        System.out.println(producer.produce());
    }
}
