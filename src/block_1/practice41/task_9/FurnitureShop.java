package block_1.practice41.task_9;

public class FurnitureShop {
    private Furniture[] furniture;

    public FurnitureShop(Furniture[] furniture) {
        this.furniture = new Furniture[furniture.length];
        for (int i = 0; i < furniture.length; i++) {
            this.furniture[i] = furniture[i];
        }
    }

    public void printFurniture() {
        for (Furniture item : furniture) {
            System.out.println(item);
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Furniture item : furniture) {
            total += item.getPrice();
        }
        return total;
    }
}
