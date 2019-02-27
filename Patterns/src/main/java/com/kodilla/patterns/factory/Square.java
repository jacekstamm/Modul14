package com.kodilla.patterns.factory;

public final class Square implements Shape {
    final String name;
    final double width;

    public Square(final String name, final double width) {
        this.name = name;
        this.width = width;
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
