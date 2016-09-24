package com.example.lesson1.table;

import com.example.lesson1.table.base.entity.ParentalPhysicalEntity;
import com.example.lesson1.table.base.entity.PhysicalEntity;

/**
 * Created by troy379 on 21.09.16.
 */
public class Table extends ParentalPhysicalEntity {

    public static final int MAX_WEIGHT_TO_WITHSTAND_KG = 1000;

    public Table(double weight, double height, double width, double depth) {
        super(weight, height, width, depth);
    }

    @Override
    public boolean put(PhysicalEntity entity) {
        double entitySquare = PhysicalEntity.Geometry.getSquare(entity);
        double entitiesSumSquare = getEntitiesSumSquare();
        double supposedSquare = entitiesSumSquare + entitySquare;
        double entitiesSumWeight = getEntitiesSumWeight();
        double supposedSumWeight = entitiesSumWeight + entity.getWeight();
        double tableSquare = getTableSquare();

        if (supposedSquare <= tableSquare
                && supposedSumWeight <= MAX_WEIGHT_TO_WITHSTAND_KG) {
            entities.add(entity);
            return true;
        } else return false;
    }

    @Override
    public boolean remove(PhysicalEntity entityToRemove) {
        for (int i = 0; i < entities.size(); i++) {
            PhysicalEntity entity = entities.get(i);
            if (entity.equals(entityToRemove)) {
                entities.remove(i);
                return true;
            }
        }
        return false;
    }

    public void showEntities() {
        if (entities.isEmpty()) {
            System.out.println("Table is clean");
        } else {
            System.out.println("Entities on table: " + entities.toString());
        }
    }

    private double getTableSquare() {
        return PhysicalEntity.Geometry.getSquare(this);
    }
}
