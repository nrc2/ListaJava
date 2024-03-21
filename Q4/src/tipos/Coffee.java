package tipos;

public abstract class Coffee {

    protected String name;
    protected Double waterRequired;
    protected Double milkRequired;
    protected Double coffeeRequired;

    public Coffee(String name, double water, double milk, double coffee) {
        this.name = name;
        this.waterRequired = water;
        this.milkRequired = milk;
        this.coffeeRequired = coffee;
    }

    public abstract void prepare();

    // Métodos getters para os atributos
    public String getName() {
        return name;
    }

    public double getWaterRequired() {
        return waterRequired;
    }

    public double getMilkRequired() {
        return milkRequired;
    }

    public double getCoffeeRequired() {
        return coffeeRequired;
    }

}