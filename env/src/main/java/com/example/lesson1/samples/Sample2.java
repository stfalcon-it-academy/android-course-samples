package com.example.lesson1.samples;

/**
 * Created by troy379 on 21.09.16.
 */
public class Sample2 {

    public interface I1 {
        int p = 10;

        int get();
    }

    public class B implements I1 {
        private int p = 20;

        public int get() {
            return p;
        }
    }

    public class C extends B implements I1 {
        public int get() {
            return p;
        }
    }

    public void run() {
        B obj = new C();
        System.out.print(obj.get());
    }

    //a) 10
    //b) 20
}
