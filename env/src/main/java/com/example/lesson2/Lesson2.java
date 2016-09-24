package com.example.lesson2;

import java.io.IOException;

/**
 * Created by troy379 on 23.09.16.
 */
public class Lesson2 {

    public class Demo {

        public void run() throws RuntimeException {
            Throwable throwable = new IOException();

            DemoException demoException = new DemoException("Houston, we have a problem");
            demoException.initCause(throwable);

            throw demoException;
        }

    }

    public class DemoException extends RuntimeException {

        public DemoException(String message) {
            super(message);
        }
    }
}
