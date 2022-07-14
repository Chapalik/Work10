package ithillel.ua;

import java.awt.*;

public class Circle {
    private int radius;
    private int circleLength;
    private int square;
    private String color;

    public Circle(int radius) {
        this.radius = radius;
        square = (int) (Math.PI * (radius * radius));
        circleLength = (int) (2 * Math.PI * radius);
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        square = (int) (Math.PI * (radius * radius));
        circleLength = (int) (2 * Math.PI * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCircleLength() {
        return circleLength;
    }

    public void setCircleLength(int circleLength) {
        this.circleLength = circleLength;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
