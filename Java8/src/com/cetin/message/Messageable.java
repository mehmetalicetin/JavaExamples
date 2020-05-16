package com.cetin.message;

public interface Messageable {
    Message message(String message);

    default void print(String message){
        System.out.println("Hello "+message);
    }
}
