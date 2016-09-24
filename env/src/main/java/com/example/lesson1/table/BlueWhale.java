package com.example.lesson1.table;

import com.example.lesson1.table.base.entity.PhysicalEntity;

/**
 * Created by troy379 on 21.09.16.
 */
public class BlueWhale extends PhysicalEntity {

    public BlueWhale() {
        super(20000, 400, 2000, 300);
    }

    @Override
    public String toString() {
        return "BlueWhale";
    }
}
