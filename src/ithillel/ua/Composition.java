package ithillel.ua;

/**
 * Описание состава пиццы
 */

public class Composition {

    private double water;
    private double sal;
    private double sugar;
    private int eggs;
    private double flour;

    public Composition(double water, double sal, double sugar, int eggs, double flour) {
        this.water = water;
        this.sal = sal;
        this.sugar = sugar;
        this.eggs = eggs;
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }
}
