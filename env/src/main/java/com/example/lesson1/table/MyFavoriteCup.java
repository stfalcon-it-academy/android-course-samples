package com.example.lesson1.table;

import com.example.lesson1.table.base.entity.PhysicalEntity;

/**
 * Created by troy379 on 21.09.16.
 */
public class MyFavoriteCup extends PhysicalEntity {

    public MyFavoriteCup() {
        super(0.2, 5, 5, 10);
    }

    @Override
    public String toString() {
        return "MyFavoriteCup";
    }
}
