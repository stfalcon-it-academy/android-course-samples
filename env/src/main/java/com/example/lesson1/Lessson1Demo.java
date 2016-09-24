package com.example.lesson1;

import com.example.lesson1.samples.Sample1;
import com.example.lesson1.samples.Sample2;
import com.example.lesson1.samples.Sample3;
import com.example.lesson1.samples.Sample4;
import com.example.lesson1.samples.Sample5;
import com.example.lesson1.samples.Sample6;
import com.example.lesson1.samples.Sample7;
import com.example.lesson1.samples.Sample8;
import com.example.lesson1.table.BlueWhale;
import com.example.lesson1.table.MyFavoriteCup;
import com.example.lesson1.table.Table;
import com.example.lesson1.table.base.entity.PhysicalEntity;

/**
 * Created by troy379 on 23.09.16.
 */
public class Lessson1Demo {

    public void run() {

//        Sample1.Clazz c = new Sample1.SubClass();
//        System.out.println(c.x + " " + c.getX());
//
//        new Sample2().run();
//
//        new Sample3.Test();
//
//        new Sample4.C();
//
//        Sample5.A m = new Sample5.B();
//        System.out.println(m.name + m.test());
//
//        new Sample6.Sub();
//
//        new Sample8.B();

        new Sample7.X();

        runTableDemo();
    }

    private void runTableDemo() {
        Table table = new Table(
                50, //weight
                50, //height
                100, //width
                50 //depth
        );

        PhysicalEntity cup = new MyFavoriteCup();

        table.showEntities();

        System.out.println("adding the cup...");
        boolean isCupAdded = table.put(cup);
        System.out.println("cup is added: " + isCupAdded);

        table.showEntities();

        System.out.println("adding the whale...");
        boolean isWhaleAdded = table.put(new BlueWhale());
        System.out.println("whale is added: " + isWhaleAdded);

        table.showEntities();

        table.remove(cup);

        table.showEntities();
    }
}
