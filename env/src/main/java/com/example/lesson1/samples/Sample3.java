package com.example.lesson1.samples;

/**
 * Created by troy379 on 21.09.16.
 */
public class Sample3 {

    public static class Base {
        private int i = 5;

        public Base() {
            System.out.println("base = " + getI());
        }

        public int getI() {
            return i;
        }
    }

    public static class Test extends Base {
        private static int i = 10;

        public Test() {
            System.out.println("child = " + super.getI());
        }

        public int getI() {
            return i;
        }
    }

    //a) 5 5
    //b) 5 10
    //c) 10 5
    //d) 10 10
}
