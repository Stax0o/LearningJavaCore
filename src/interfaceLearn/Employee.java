package interfaceLearn;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voise() {
        System.out.println(name);
    }
}
