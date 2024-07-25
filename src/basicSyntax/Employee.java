package basicSyntax;

public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getSalary(int month) {
        return String.format("%s за последние %d месяцев получил %d рублей.", name, month, month * salary);
    }
}
