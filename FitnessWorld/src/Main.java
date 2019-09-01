import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Member> people = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();


        people.add(new Member("Ali", "090689-5010", false));
        people.add(new Member("Wajid", "218450-2349", true));
        people.add(new Member("jarl", "345678-1234", true));
        people.add(new Member("Alex", "871023-9999", false));
        people.add(new Member("Jonas", "741023-6541", true));

        employeeList.add(new Instructor("Kim", "050649-8520", 120));
        employeeList.add(new Administration("Bi", "784325-2015", 2));
        employeeList.add(new Instructor("Bo", "648720-0022", 10));
        employeeList.add(new Administration("John", "367405-4564", 5));


        printNameAndCpr((ArrayList<Member>) people, (ArrayList<Employee>) employeeList);
        fitnessMembers((ArrayList<Member>) people);
        printEmployee((ArrayList<Employee>) employeeList);

    }

    // Denne metode printer alle members og employess navn og cpr.
    public static void printNameAndCpr(ArrayList<Member> people, ArrayList<Employee> employeeList) {


        System.out.println("Members & Empoloyess Navn / Cpr");
        System.out.printf("%-15s%-12s\n", "Navn", "Cpr");
        start();
        for (Member p :
                people) {

            System.out.printf("%-15s%-12s\n", p.getNavn(), p.getCpr());
        }
        for (Employee e :
                employeeList) {
            System.out.printf("%-15s%-12s\n", e.getNavn(), e.getCpr());

        }
        end();
    }

    //Denne metode printer alle members info ud.
    public static void fitnessMembers(ArrayList<Member> people) {

        System.out.println("Fitness Members");
        System.out.printf("%-15s%-12s%-12s%-12s\n", "Navn", "Cpr", "Member type", "Fee");
        start();
        for (Member m :
                people) {
            System.out.printf("%-15s%-12s%-12s%-12s\n", m.getNavn(), m.getCpr(), m.getMemberType(), m.monthlyFee());

        }
        end();
    }

    // Denne metode printer alle employyes info ud.
    public static void printEmployee(ArrayList<Employee> employeeList) {
        System.out.println("Fitness Employees");
        System.out.printf("%-15s%-12s%-12s%-12s%-12s\n", "Navn", "Cpr", "Hours", "Salary", "Vacation");
        start();
        for (Employee e :
                employeeList) {

            if (e instanceof Administration) {
                System.out.printf("%-15s%-12s%-12s%-12s%-12s\n", e.getNavn(), e.getCpr(), e.getHours(), e.getSalary(), ((Administration) e).getVacation());
            } else {
                System.out.printf("%-15s%-12s%-12s%-12s\n", e.getNavn(), e.getCpr(), e.getHours(), e.getSalary());
            }
        }
        end();
    }

    // Denne metode laver *
    public static void start() {

        for (int i = 0; i < 75; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    //Demme metode laver =
    public static void end() {
        for (int i = 0; i < 75; i++) {
            System.out.print("=");
        }
        System.out.println("\n\n");
    }

}
