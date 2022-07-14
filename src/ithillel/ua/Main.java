package ithillel.ua;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Circle colorCircle = new Circle(10, "Blue");
        System.out.println("Circle = " + "Circle length:" + circle.getCircleLength() + " ," + "square:" + circle.getSquare());
        System.out.println("Circle with color = " + "Circle length:" + colorCircle.getCircleLength() + " ," + "square:" + colorCircle.getSquare() + " ," + "Color:" + colorCircle.getColor());
    }
}