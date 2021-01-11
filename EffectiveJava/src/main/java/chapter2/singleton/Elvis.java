package chapter2.singleton;

public class Elvis {

    private static final Elvis instance = new Elvis();

    private Elvis() {
    }

    public static Elvis getNewInstance(){
        return instance;
    }
}
