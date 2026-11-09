package q.practice41.furniture;

public abstract class Furniture {
    private String material;
    private double price;

    public Furniture(String material, double price) {
        this.material = material;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + ", материал: " + material + ", цена: " + price + " руб.";
    }
}
