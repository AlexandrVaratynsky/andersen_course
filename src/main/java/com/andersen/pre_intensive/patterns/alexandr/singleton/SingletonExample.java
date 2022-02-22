package com.andersen.pre_intensive.patterns.alexandr.singleton;

public class SingletonExample {
    private static  SingletonExample instance;
    private String data;

    private SingletonExample(String data) {
        this.data = data;
    }

    public static SingletonExample getInstance(String data) {
        if (data == null) {
            throw new NullPointerException("data is Null");
        }
        if (instance == null) {
            instance = new SingletonExample(data);
        }
        return instance;
    }

    public String getData() {
        return data;
    }
}
