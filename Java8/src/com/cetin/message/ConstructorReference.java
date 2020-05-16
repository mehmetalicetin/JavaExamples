package com.cetin.message;

public class ConstructorReference {
    public static void main(String[] args) {
        Messageable message = Message::new;
        Message message1 = message.message("New message from Lamda !!");
        message.print(message1.getMessage());
    }
}
