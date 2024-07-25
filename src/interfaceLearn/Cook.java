package interfaceLearn;

public class Cook extends Employee implements CanCook{
    public Cook(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("Cooking");
    }
}
