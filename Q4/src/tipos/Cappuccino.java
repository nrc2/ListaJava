package tipos;

public class Cappuccino extends Coffee {

    public Cappuccino() {
        super("Cappuccino", 150, 50, 18);
    }

    // @Override
    public void prepare() {
        System.out.println("Fazendo um Cappuccino...");
        System.out.println("Moer grãos para " + coffeeRequired + "g de café");
        System.out.println("Aquecer " + waterRequired + "ml de água");
        System.out.println("Fazer espuma com " + milkRequired + "ml de leite");
        System.out.println("Misturar o café com a espuma de leite");
        System.out.println("Seu Cappuccino está pronto!");
    }
}
