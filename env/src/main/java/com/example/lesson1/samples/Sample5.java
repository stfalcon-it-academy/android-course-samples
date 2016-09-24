package com.example.lesson1.samples;

/**
 * Created by troy379 on 21.09.16.
 */
public class Sample5 {

    public static class A {
        String name = "a ";
        String test() {
            return "test A ";
        }
    }

    public static class B extends A {
        String name = "b ";
        String test() {
            return "test B ";
        }
    }
}
