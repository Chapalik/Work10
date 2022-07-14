package ithillel.ua;

/**
 * Описание копмонентов которын нужны для описания пиццы
 */

public class Pizza {
    private CircleForPizza basis;
    private Composition composition;
    private String name;
    private double cost;

    private int diameter;


    public Pizza(Composition composition, CircleForPizza basis, String name, double cost) {
        this.composition = composition;
        this.name = name;
        this.cost = cost;
        this.basis = basis;
        this.diameter = basis.getDiameter();
    }

    public CircleForPizza getBasis() {
        return basis;
    }

    public void setBasis(CircleForPizza basis) {
        this.basis = basis;
    }

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
