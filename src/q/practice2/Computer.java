package q.practice2;

public class Computer {
    private final String model;
    private final int price;

    public Computer(String model, int price) {
        if (model == null || model.trim().isEmpty() || price < 0) {
            throw new IllegalArgumentException("Нужны модель и неотрицательная цена");
        }
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
