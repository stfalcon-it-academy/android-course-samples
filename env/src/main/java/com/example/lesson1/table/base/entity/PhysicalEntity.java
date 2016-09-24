package com.example.lesson1.table.base.entity;

/**
 * Created by troy379 on 21.09.16.
 */
public class PhysicalEntity implements IPhysicalEntity {

    private double weight;
    private double height;
    private double width;
    private double depth;

    public PhysicalEntity(double weight, double height, double width, double depth) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "PhysicalEntity{" +
                "weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhysicalEntity)) return false;

        PhysicalEntity entity = (PhysicalEntity) o;

        if (Double.compare(entity.weight, weight) != 0) return false;
        if (Double.compare(entity.height, height) != 0) return false;
        if (Double.compare(entity.width, width) != 0) return false;
        return Double.compare(entity.depth, depth) == 0;

    }

    public static final class Geometry {
        private Geometry() {
            throw new AssertionError();
        }

        public static double getSquare(IPhysicalEntity entity) {
            return entity.getWidth() * entity.getHeight();
        }
    }
}
