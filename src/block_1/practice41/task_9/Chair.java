package block_1.practice41.task_9;

public class Chair extends Furniture {
    public Chair(String material, double price) {
        super(material, price);
    }

    @Override
    public String getType() {
        return "Стул";
    }
}
