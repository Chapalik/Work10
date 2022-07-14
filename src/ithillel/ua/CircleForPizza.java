package ithillel.ua;

/**
 * Утилитный класс для получения диаметра,площу,периметр имея радиус
 */

public class CircleForPizza {
    private int radius;
    private int circleLength;
    private int square;
    private int diameter;


    public CircleForPizza(int radius) {
        this.radius = radius;
        square = (int) (Math.PI * (radius * radius));
        circleLength = (int) (2 * Math.PI * radius);
        diameter = (radius * radius);
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

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
