package com.example.lesson1.table.base.entity;

import java.util.ArrayList;

/**
 * Created by troy379 on 21.09.16.
 */
public abstract class ParentalPhysicalEntity extends PhysicalEntity {

    protected ArrayList<PhysicalEntity> entities = new ArrayList<>();

    public ParentalPhysicalEntity(double weight, double height, double width, double depth) {
        super(weight, height, width, depth);
    }

    public abstract boolean put(PhysicalEntity entity);

    public abstract boolean remove(PhysicalEntity entityToRemove);

    public final void removeAll() {
        entities.clear();
    }

    public final int getEntitiesCount() {
        return entities.size();
    }

    protected double getEntitiesSumSquare() {
        double entitiesSumSquare = 0.0;
        for (PhysicalEntity entity : entities) {
            entitiesSumSquare += Geometry.getSquare(entity);
        }
        return entitiesSumSquare;
    }

    protected double getEntitiesSumWeight() {
        double entitiesSumWeight = 0.0;
        for (PhysicalEntity entity : entities) {
            entitiesSumWeight += entity.getWeight();
        }
        return entitiesSumWeight;
    }
}
