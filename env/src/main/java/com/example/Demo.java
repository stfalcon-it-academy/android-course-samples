package com.example;

import com.example.lesson1.practice.transport.ElectroCar;
import com.example.lesson1.practice.transport.Transport;
import com.example.lesson2.Lesson2;

public class Demo {

    public static void main(String[] args) {
        try {
            new Lesson2().new Demo().run();
        } catch (Lesson2.DemoException e) {

        }

        Transport transport = new ElectroCar(4, 4);
        transport.setTransportListener(() -> System.out.println("Listener.onStopped was called"));

        transport.prepare();
        transport.move(100);
        transport.stop();
        transport.makeSound();
    }
}
