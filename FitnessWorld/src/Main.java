import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        printNameAndCpr();
        fitnessMembers();
        printEmployee();

    }

    public static void printNameAndCpr() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ali", "090689-5010"));
        people.add(new Person("Wajid", "218450-2349"));
        people.add(new Person("Jarl", "055039-3410"));
        people.add(new Person("Alex", "349512-5964"));
        System.out.printf("%-15s%-12s\n", "Navn", "Cpr");
        start();
        for (Person p :
                people) {
            System.out.printf("%-15s%-12s\n", p.getNavn(), p.getCpr());
        }
        end();
    }

    public static void fitnessMembers() {
        List<Menber> member = new ArrayList<>();
        member.add(new Menber("Ali", "090689-5010", false));
        member.add(new Menber("Wajid", "218450-2349", true));
        member.add(new Menber("Alex", "6454", false));
        System.out.printf("%-15s%-12s%-12s%-12s\n", "Navn", "Cpr", "Member type", "Fee");
        start();
        for (Menber m :
                member) {
            System.out.printf("%-15s%-12s%-12s%-12s\n", m.getNavn(), m.getCpr(), m.getMemberType(), m.monthlyFee());

        }
        end();
    }

    public static void printEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Instructor("Kim", "050649-8520", 120));
        employees.add(new Administration("Bi", "784325-2015", 2));
        employees.add(new Instructor("Bo", "648720-0022", 10));
        employees.add(new Administration("John", "367405-4564", 5));
        System.out.printf("%-15s%-12s%-12s%-12s%-12s\n", "Navn", "Cpr", "Hours", "Salary", "Vacation");
        start();
        for (Employee e :
                employees) {

            if (e instanceof Administration) {
                System.out.printf("%-15s%-12s%-12s%-12s%-12s\n", e.getNavn(), e.getCpr(), e.getHours(), e.getSalary(), ((Administration) e).getVacation());
            } else {
                System.out.printf("%-15s%-12s%-12s%-12s\n", e.getNavn(), e.getCpr(), e.getHours(), e.getSalary());
            }
        }
        end();
    }

    public static void start() {

        for (int i = 0; i < 75; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void end() {
        for (int i = 0; i < 75; i++) {
            System.out.print("=");
        }
        System.out.println("\n\n");
    }

}
