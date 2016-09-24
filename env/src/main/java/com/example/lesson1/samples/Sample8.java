package com.example.lesson1.samples;

/**
 * Created by troy379 on 21.09.16.
 */
public class Sample8 {

    static abstract class A {
        int a = 8;

        public A() {
            show();
        }

        abstract void show();
    }

    static class B extends A {
        int a = 90;

        public B() {
        }

        void show() {
            System.out.println("" + a);
        }
    }
}
