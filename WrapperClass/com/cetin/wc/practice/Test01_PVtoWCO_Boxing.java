package com.cetin.wc.practice;

public class Test01_PVtoWCO_Boxing {
    public static void main(String[] args) {
        Long l01 = Long.valueOf(5);
        Integer i01 = Integer.valueOf(5);
        Double d01 = Double.valueOf(0.5);
        Float  f01 = Float.valueOf(9l);
        Float  f02 = Float.valueOf(9);
        Float  f03 = Float.valueOf( 0.9F);
        Character c001 = Character.valueOf('c');
        Character c01 = Character.valueOf((char)44);
        Character c02 = Character.valueOf((char)44.4);
        Byte b01 = Byte.valueOf((byte)5);
        byte bpv = 5;
        Byte b02 = Byte.valueOf(bpv);
        Boolean bo01 = Boolean.valueOf(true);
        Boolean bo02 = Boolean.valueOf(false);
        Boolean bo03 = Boolean.valueOf("x");


        System.out.println("Integer:"+i01);
        System.out.println("Double:"+d01);
        System.out.println("Character:"+c001);
        System.out.println("Character:"+c01);
        System.out.println("Character:"+c02);
        System.out.println("Byte:"+b01);
        System.out.println("Byte:"+b02);
        System.out.println("Float:"+f01);
        System.out.println("Float:"+f02);
        System.out.println("Float:"+f03);
        System.out.println("Boolean:"+bo03);

        //Every wrapper class implicitly contains its primitive data type variable
        //to store its primitive value.

        //Double, Float, Long, Integer, Character, Short, Byte, Boolean

        //Float and double does not have pooling.
        //Byte, Short, Character, Integer, Long, Boolean pooling is applied up to byte range -127 ->128

        //Byte is always have same reference because byte range is -127 ->128, others will be show different reference over range.

        System.out.println();

        Boolean bl01 = Boolean.valueOf(true);
        Boolean bl02 = Boolean.valueOf(true);
        System.out.println("Boolean.valueOf -> "+(bl01 == bl02));

        Byte by01 = Byte.valueOf((byte) 5);
        Byte by02 = Byte.valueOf((byte) 5);
        System.out.println("Byte.valueOf -> "+ (by01 == by02));

        Byte byt01 = Byte.valueOf((byte) 500);
        Byte byt02 = Byte.valueOf((byte) 500);
        System.out.println("Byte.valueOf -> "+ (byt01 == byt02));


        Short sh01 = Short.valueOf((short) 5);
        Short sh02 = Short.valueOf((short) 5);
        System.out.println("Short.valueOf -> "+(sh01 == sh02));

        Integer in01 = Integer.valueOf(5);
        Integer in02 = Integer.valueOf(5);
        System.out.println("Integer.valueOf -> "+(in01 == in02));

        Long lg01 = Long.valueOf(5l);
        Long lg02 = Long.valueOf(5l);
        System.out.println("Long.valueOf -> "+(lg01 == lg02));

        Float fl01 = Float.valueOf(5f);
        Float fl02 = Float.valueOf(5f);
        System.out.println("Float.valueOf -> "+ (fl01 == fl02));

        Double do01 = Double.valueOf(5d);
        Double do02 = Double.valueOf(5d);
        System.out.println("Double.valueOf -> "+ (do01 == do02));

    }
}
