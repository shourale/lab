package block_1.practice41.task_9;

public class Table extends Furniture {
    public Table(String material, double price) {
        super(material, price);
    }

    @Override
    public String getType() {
        return "Стол";
    }
}
