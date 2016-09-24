package com.example.lesson1.samples;

/**
 * Created by troy379 on 21.09.16.
 */
public class Sample4 {

    public static class A {
        static { System.out.println("static A1"); }
        A() {
            System.out.println("A");
        }
        {System.out.println("NON static A1");}
    }
    public static class B extends A {
        static { System.out.println("static B1"); }
        B() {
            System.out.println("B");
        }
    }
    public static class C extends B {
        static {
            System.out.println("static C1");
        }
        { System.out.println("non static C1"); }
        public C() {
            this("");
            System.out.println("C1");
        }

        public C(String str) {
            System.out.println("C2");
        }

        { System.out.println("non static C2"); }
    }
}
