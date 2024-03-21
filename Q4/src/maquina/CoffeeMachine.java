package maquina;

import tipos.*;

public class CoffeeMachine {
    private double waterAmount;
    private double milkAmount;
    private double coffeeAmount;

    // Construtor para inicializar a máquina de café com os ingredientes
    public CoffeeMachine(double water, double milk, double coffee) {
        this.waterAmount = water;
        this.milkAmount = milk;
        this.coffeeAmount = coffee;
    }

    // Método para fazer café
    public void makeCoffee(Coffee coffee) {
        if (waterAmount >= coffee.getWaterRequired() && milkAmount >= coffee.getMilkRequired()
                && coffeeAmount >= coffee.getCoffeeRequired()) {
            coffee.prepare();
            waterAmount -= coffee.getWaterRequired();
            milkAmount -= coffee.getMilkRequired();
            coffeeAmount -= coffee.getCoffeeRequired();
        } else {
            System.out.println("Não há ingredientes suficientes para fazer " + coffee.getName());
        }
    }
}
