package com.example.lesson3;

import java.io.File;

/**
 * Created by troy379 on 26.09.16.
 */
public abstract class AbstractStreamDemo {

    protected File file;

    public AbstractStreamDemo(String fileName) {
        this.file = new File(fileName);
    }

    public abstract void write(String text);
    public abstract void read();
}
