package com.example.lesson1.samples;

/**
 * Created by troy379 on 21.09.16.
 */
public class Sample1 {

    public static class Clazz {
        int x = 2;

        public int getX() {
            return x;
        }
    }

    public static class SubClass extends Clazz {
        int x = 1;

        public int getX() {
            return x;
        }
    }

    public void main() {
        Clazz c = new SubClass();
        System.out.println(c.x + " " + c.getX());
    }

}
