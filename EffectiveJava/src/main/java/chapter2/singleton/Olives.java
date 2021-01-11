package chapter2.singleton;

/*
you can’t create subclasses of an enum-based singleton
* */
public enum Olives {
    INSTANCE;

    public static Olives getInstance(){
        return INSTANCE;
    }
}
