package com.example.lesson3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by troy379 on 26.09.16.
 */
public class CharacterStreams extends AbstractStreamDemo {

    public CharacterStreams(String fileName) {
        super(fileName);
    }

    @Override
    public void write(String text) {
//        FileWriter fileWriter = null;
        PrintWriter fileWriter = null;
        try {
//            fileWriter = new FileWriter(file);
            fileWriter = new PrintWriter(new FileWriter(file));

            char[] content = text.toCharArray();
            fileWriter.write(content);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Can't write file");
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (Exception ignore) { }
        }
    }

    @Override
    public void read() {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);

            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Can't read file");
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (Exception ignore) { }
        }
    }
}
