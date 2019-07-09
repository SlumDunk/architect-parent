package com.liu.base.conn011;

public class Singleton {

    private static class InnerSingletion {
        private static Singleton single = new Singleton();
    }

    public static Singleton getInstance() {
        return InnerSingletion.single;
    }

}
