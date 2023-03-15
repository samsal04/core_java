package com.apolis.designpattern;

public class SingletonClass {

    private static final SingletonClass instace= new SingletonClass();
    private SingletonClass(){

    }
    public static SingletonClass getInstace() {
        {
            return instace;
        }
    }
}


class LazyInitialization{
    private static LazyInitialization instance;

    private LazyInitialization(){};

    synchronized public static LazyInitialization getInstance(){

        if (instance== null){
            instance= new LazyInitialization();
        }
        return instance;
    }
}

