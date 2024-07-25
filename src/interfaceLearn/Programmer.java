package interfaceLearn;

public class Programmer extends Employee implements CanProgram {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void program() {
        System.out.println("Programmer");
    }
}
