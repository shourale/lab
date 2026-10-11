package q.practice41.furniture;

public class FurnitureShop {
    private final Furniture[] furniture;

    public FurnitureShop(Furniture[] furniture) {
        this.furniture = furniture.clone();
    }

    public void printFurniture() {
        for (Furniture item : furniture) System.out.println(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Furniture item : furniture) total += item.getPrice();
        return total;
    }
}
