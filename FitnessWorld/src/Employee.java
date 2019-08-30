public class Employee extends Person {
    int hours;
    private int salary = 23000;

    public Employee(String navn, String cpr) {
    }

    public Employee(String navn, String cpr, int hours) {
        super(navn, cpr);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }
}
