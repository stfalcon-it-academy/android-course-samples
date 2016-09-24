package com.example.lesson1.samples;

/**
 * Created by troy379 on 21.09.16.
 */
public class Sample6 {

    public static class Base {
        static {
            System.out.println("Static");
        }

        public Base(String s) {
            System.out.println("Base " + s);
        }
    }

    public static class Sub extends Base {
        private static final String Str = "Constructor";

        public Sub() {
            super(Str);
            System.out.println("Sub " + Str);
        }
    }
}
