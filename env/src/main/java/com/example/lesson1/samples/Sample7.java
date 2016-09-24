package com.example.lesson1.samples;

/**
 * Created by troy379 on 21.09.16.
 */
public class Sample7 {

    public static class Y {
        public Y() {
            System.out.print("Y");
        }
    }

    public static class Z {
        public Z() {
            System.out.print("Z");
        }
    }

    public static class X extends Z {
        private Y y = new Y();

        public X() {
            System.out.print("X");
        }
    }
}
