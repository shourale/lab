package practice2;

public class Shop {
    private Computer[] computers = new Computer[0];

    public void addComputer(Computer computer) {
        if (computer == null) return;
        Computer[] newComputers = new Computer[computers.length + 1];
        for (int i = 0; i < computers.length; i++) {
            newComputers[i] = computers[i];
        }
        newComputers[computers.length] = computer;
        computers = newComputers;
    }

    public Computer findComputer(String model) {
        for (Computer computer : computers) {
            if (computer.getModel().equalsIgnoreCase(model)) return computer;
        }
        return null;
    }

    public boolean removeComputer(String model) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                Computer[] newComputers = new Computer[computers.length - 1];
                for (int j = 0; j < i; j++) {
                    newComputers[j] = computers[j];
                }
                for (int j = i + 1; j < computers.length; j++) {
                    newComputers[j - 1] = computers[j];
                }
                computers = newComputers;
                return true;
            }
        }
        return false;
    }

    public Computer[] getComputers() {
        Computer[] result = new Computer[computers.length];
        for (int i = 0; i < computers.length; i++) {
            result[i] = computers[i];
        }
        return result;
    }
}
