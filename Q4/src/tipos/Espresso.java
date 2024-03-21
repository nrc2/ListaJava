package tipos;

public class Espresso extends Coffee {
    public Espresso() {
        super("Espresso", 50, 0, 18);
    }

    // @Override -> Polimorfismo
    public void prepare() {
        System.out.println("Fazendo um Espresso...");
        System.out.println("Moer grãos para " + coffeeRequired + "g de café");
        System.out.println("Aquecer " + waterRequired + "ml de água");
        System.out.println("Pressionar a água através do café moído");
        System.out.println("Seu Espresso está pronto!");
    }

}
