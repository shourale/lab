package block_1.practice41.furniture;

public class TestFurniture {
    public static void main(String[] args) {
        Furniture[] items = {new Chair("дерево", 2000), new Table("дерево", 5000)};
        FurnitureShop shop = new FurnitureShop(items);
        shop.printFurniture();
        System.out.println("Общая стоимость: " + shop.getTotalPrice());
    }
}
