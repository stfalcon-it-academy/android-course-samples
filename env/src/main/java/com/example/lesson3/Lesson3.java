package com.example.lesson3;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * Created by troy379 on 25.09.16.
 */
public class Lesson3 {

    public static final String FILE_PATH = "test.com";

    public Lesson3() {
        new ByteStreamsDemo(FILE_PATH).write("Hello world :)");
        new ByteStreamsDemo(FILE_PATH).read();

        System.out.println("");

        new CharacterStreams(FILE_PATH).write("Hello world :)");
        new CharacterStreams(FILE_PATH).read();

        System.out.println("");

        new BufferedStreams(FILE_PATH).write("Hello world :)");
        new BufferedStreams(FILE_PATH).read();

//        File file = new File(FILE_PATH);
//
//        file.exists();
//        file.canRead();
//        file.canWrite();
//        file.delete();
//        file.listFiles();
//        file.createNewFile();
//        file.mkdir();
//        file.isFile();
//        file.isDirectory();
//        file.isHidden();
//        file.setReadable(true);
//        file.setReadOnly(true);
//        file.setWritable(true);
//        file.setWritable(true);

//        FileCopier.copy(FILE_PATH, "yo.txt");

//        IOUtils.
//        FileUtils.
    }

}
