package interfaceLearn;

public class Driver extends Employee implements CanDrive{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Driver drive");
    }
}
