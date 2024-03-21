package executar;

import maquina.*;
import tipos.*;

public class Main {
    public static void main(String[] args) {
        // Inicializa a máquina de café com ingredientes
        CoffeeMachine myCoffeeMachine = new CoffeeMachine(1000, 500, 500);

        // Cria instâncias de diferentes tipos de café
        Coffee espresso = new Espresso();
        Coffee latte = new Latte();
        Coffee cappuccino = new Cappuccino();

        // Faz cada tipo de café
        myCoffeeMachine.makeCoffee(espresso);
        myCoffeeMachine.makeCoffee(latte);
        myCoffeeMachine.makeCoffee(cappuccino);
    }
}