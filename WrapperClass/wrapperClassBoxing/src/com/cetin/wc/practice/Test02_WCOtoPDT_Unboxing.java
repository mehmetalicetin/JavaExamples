package com.cetin.wc.practice;

public class Test02_WCOtoPDT_Unboxing {
    public static void main(String[] args) {
        Integer i01 = Integer.valueOf(500000);
        int i1 = i01.intValue();
        System.out.println(i1);
        byte byteValue = i01.byteValue();
        System.out.println(byteValue);
        short shortValue = i01.shortValue();
        System.out.println(shortValue);


        Character c1 = Character.valueOf((char) 65);
        char charValue = c1.charValue();
        System.out.println(charValue);


        Byte b01 = Byte.valueOf((byte) 5);
        byte b1 = b01.byteValue();


        //char ch1 = i01.charValue();
        //char ch2 =i01.intValue();
        char ch3 = (char)i01.intValue();

        //boolean bo1 = i01.booleanValue();
        //boolean b02 = i01.intValue();
        //boolean b03 = (boolean) i01.intValue();
    }
}
