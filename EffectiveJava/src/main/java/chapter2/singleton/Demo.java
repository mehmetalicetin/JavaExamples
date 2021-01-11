package chapter2.singleton;

public class Demo {

    public static void main(String[] args) {
        Elvis elvis = Elvis.getNewInstance();
        System.out.printf(String.format("adress:  %20s",elvis.toString()));
        System.out.println();
        Elvis elvis1 = Elvis.getNewInstance();
        System.out.printf(String.format("adress:  %20s",elvis1.toString()));
        System.out.println();

        Olives olives = Olives.getInstance();
        Olives olives1 = Olives.getInstance();
        System.out.printf(String.format("adre   ss:  %20s",olives.toString()));
        System.out.println();

        System.out.printf(String.format("adre   ss:  %20s",olives.toString()));
    }
}