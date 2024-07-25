package basicSyntax;

public class Man {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 && age > 150) {
            this.age = age;
        }
    }
}
