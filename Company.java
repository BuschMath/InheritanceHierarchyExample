// Example client code
public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 123);
        Manager mgr1 = new Manager("Jane Smith", 456, "Sales");
        Engineer eng1 = new Engineer("Bob Johnson", 789, "Java");

        emp1.setName("John Smith");
        mgr1.manageTeam();
        eng1.writeCode();

        Salesperson sp1 = new Salesperson("Samantha Brown", 246, "Sales");
        sp1.makeSales();
    }
}
