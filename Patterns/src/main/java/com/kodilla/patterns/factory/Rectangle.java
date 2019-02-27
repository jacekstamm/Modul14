package com.kodilla.patterns.factory;

public class Rectangle implements Shape {
    final String name;
    final double width;
    final double length;

    public Rectangle(final String name, final double width, final double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
