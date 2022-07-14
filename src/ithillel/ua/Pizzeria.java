package ithillel.ua;

/**
 * Пиицерия
 * Создаем массив с 4 разными пиццами
 * С помощью цикла выводим данные каждой пиццы отдельно
 */
public class Pizzeria {
    public static void main(String[] args) {
        Pizza[] Pizzas = new Pizza[4];
        Pizzas[0] = new Pizza(new Composition(0.5, 0.1, 0.1, 3, 0.5),
                new CircleForPizza(2), "Margarita", 12.2);
        Pizzas[1] = new Pizza(new Composition(0.5, 0.2, 0.2, 3, 0.5),
                new CircleForPizza(10), "Chicharito", 15.2);
        Pizzas[2] = new Pizza(new Composition(0.8, 0.1, 0.1, 3, 0.5),
                new CircleForPizza(5), "Kuku", 18.2);
        Pizzas[3] = new Pizza(new Composition(0.8, 0.1, 0.1, 3, 0.5),
                new CircleForPizza(15), "4Dogs", 18.2);
        for (int i = 0; i < Pizzas.length; i++) {
            System.out.println("Pizza " + Pizzas[i].getName() + " Cost: " +
                    Pizzas[i].getCost() + " ,her diameter - " + Pizzas[i].getDiameter() +
                    " , her composition : " + "Water: " + Pizzas[i].getComposition().getWater() + "ml" +
                    " , Sal: " + Pizzas[i].getComposition().getSal() + "kg" + " ,Sugar: " + Pizzas[i].getComposition().getSugar() + "kg" +
                    " ,Eggs: " + Pizzas[i].getComposition().getEggs() + " ,Flour: " + Pizzas[i].getComposition().getFlour() + "kg");
        }
    }
}
