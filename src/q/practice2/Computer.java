package q.practice2;

public class Computer {
    private String model;
    private int price;

    public Computer(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return model + ": " + price + " руб.";
    }
}
