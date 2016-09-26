package com.example.lesson3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by troy379 on 26.09.16.
 */
public class ByteStreamsDemo extends AbstractStreamDemo {

    public ByteStreamsDemo(String fileName) {
        super(fileName);
    }

    @Override
    public void write(String text) {
        FileOutputStream outputStream = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            if (file.createNewFile()) {
                outputStream = new FileOutputStream(file);
                byte[] contentInBytes = text.getBytes();

                outputStream.write(contentInBytes);
                outputStream.flush();
            } else throw new IOException();
        } catch (IOException e) {
            System.err.println("An error has occurred while creating file.");
        } finally {
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException ignore) { }
        }
    }

    @Override
    public void read() {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);

            System.out.println("Total file size to read (in bytes) : "
                    + inputStream.available());

            int content;
            while ((content = inputStream.read()) != -1) {
                System.out.print(content + " ");
            }

        } catch (IOException e) {
            System.err.println("An error has occurred while reading file.");
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException ignore) { }
        }
    }
}
