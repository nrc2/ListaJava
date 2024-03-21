package tipos;

public class Latte extends Coffee {

    public Latte() {
        super("Latte", 200, 150, 18);
    }

    // @Override
    public void prepare() {
        System.out.println("Fazendo um Latte...");
        System.out.println("Moer grãos para " + coffeeRequired + "g de café");
        System.out.println("Aquecer " + milkRequired + "ml de leite");
        System.out.println("Aquecer " + waterRequired + "ml de água");
        System.out.println("Misturar o café com o leite aquecido");
        System.out.println("Seu Latte está pronto!");
    }

}
