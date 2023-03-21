public class Salesperson extends Manager {
    public Salesperson(String name, int id, String department) {
        super(name, id, department);
    }

    public void makeSales() {
        System.out.println("Making sales...");
    }
}
