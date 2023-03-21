public class Manager extends Employee {
    private String department;

    public Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    // Getter and setter for department
    public void manageTeam() {
        System.out.println("Managing team...");
    }
}
