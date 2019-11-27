package factory;

import jdk.internal.dynalink.beans.StaticClass;

public class AFactory {
    private static A ainstance = new A();

    public static A createA(){
        return ainstance ;
    }

    public A createB(){
        return new A();
    }
}
