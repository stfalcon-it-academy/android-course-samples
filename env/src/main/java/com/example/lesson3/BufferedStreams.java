package com.example.lesson3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by troy379 on 26.09.16.
 */
public class BufferedStreams extends AbstractStreamDemo {

    public BufferedStreams(String fileName) {
        super(fileName);
    }

    @Override
    public void write(String text) {
//        BufferedWriter bufferedWriter = null;
        PrintWriter bufferedWriter = null;

        try {
//            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter = new PrintWriter(new FileWriter(file));
            char[] content = text.toCharArray();
            bufferedWriter.write(content);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Can't read file");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (Exception ignore) {
            }
        }
    }

    @Override
    public void read() {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(
//                            new FileInputStream(file), "UTF8"));

            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Can't read file");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Exception ignore) {
            }
        }
    }
}
