package demo.creational;

import patterns.creational.singleton.SingletonClass;

/**
 * Created by gaurav on 26/11/17.
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass1.setInstanceName("instance1");

        SingletonClass singletonClass2 = SingletonClass.getInstance();
        System.out.println(singletonClass2.getInstanceName());
    }
}
