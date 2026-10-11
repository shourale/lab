package q.practice41.furniture;

public abstract class Furniture {
    private final String material;
    private final double price;

    public Furniture(String material, double price) {
        if (!Double.isFinite(price) || price < 0) throw new IllegalArgumentException("Некорректная цена");
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
