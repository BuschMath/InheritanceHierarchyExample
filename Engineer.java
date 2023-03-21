public class Engineer extends Employee {
    private String programmingLanguage;

    public Engineer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter and setter for programmingLanguage
    public void writeCode() {
        System.out.println("Writing code...");
    }
}
