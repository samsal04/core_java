package com.apolis.javapractice;
// Singleton Pattern says that : define a class that has only one instance and provides a global point of access to it
// Eager initialization( Eager Initialization): done by creating private instance of the class and providing reference to it
public class Singleton {
    private static final Singleton instance=new Singleton();
    private  Singleton(){
    }
    public static Singleton getInstance(){
        return  instance;
    }
}

// Using static block (Eager initialization): Object is created in static block so that we can have access on its creation
//                                            like exception handling.
class SingletonStatic{
    public static SingletonStatic instance;
    private SingletonStatic(){}
    static
    {
        instance=new SingletonStatic();
    }
}

// Lazy initialization: This way, object is created only when it's needed.
class SingletonLazy{
    private static SingletonLazy instance;

    private SingletonLazy(){};
    public static SingletonLazy getInstance()
    {
        if (instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }
}

// Thread safe Singleton: This is used to create singleton class in multithreaded environment.

class SingletonThreadSafe{
    private static SingletonThreadSafe instance;
    private SingletonThreadSafe(){};

    synchronized public static SingletonThreadSafe getInstance(){
        if(instance==null)
        {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}

// Lazy initialization with Double check locking: This is used to overcome the overhead problem of synchronised code

class SingletonDoubleLock{
    private static SingletonDoubleLock instance;

    private SingletonDoubleLock(){};

    public static SingletonDoubleLock getInstance(){
        if (instance==null)
        {
            synchronized (SingletonDoubleLock.class)
            {
                if(instance==null)
                {
                    instance=new SingletonDoubleLock();
                }
            }
        }
        return instance;
    }
}

// Bill Pugh Singleton implementation: This is done with the concept of inner static classes
class SingletongBillPough{

    private SingletongBillPough(){};

    private static class BillPughSingleton
    {
        private static final SingletongBillPough instance= new SingletongBillPough();
    }
    public static SingletongBillPough getInstance(){
        return BillPughSingleton.instance;
    }
}


