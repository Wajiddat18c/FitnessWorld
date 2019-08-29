/**
 * @author wajid
 *
 */
public class FitnessWorld {
    private static InfoEmployess infoEmployess = new InfoEmployess();
    private static Employees employees = new Employees();
    private static Members members = new Members();
    private static InfoMembers infoMembers = new InfoMembers();

    //Main metode der kalder statiske metoder.
    public static void main(String[] args) {

        printEmployees();
        for (int i = 0; i <= 2; i++) infoEmployess.newLine();
        printMembers();
        for (int i = 0; i <= 2; i++) infoEmployess.newLine();
        printNameAndCpr();

    }

    public static void start() {

        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void end() {
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
    }

    public static void printEmployees() {
        System.out.println("FITNESS EMPLOYEES");
        System.out.println(infoEmployess.name() + infoEmployess.cpr() + infoEmployess.hours() + infoEmployess.salary() + infoEmployess.vacation());

        start();
        employees.emp1();
        infoEmployess.newLine();
        employees.emp2();
        infoEmployess.newLine();
        employees.emp3();
        infoEmployess.newLine();
        employees.emp4();
        end();
    }

    public static void printNameAndCpr() {
        System.out.println("EMPLOYEES and MEMBERS Name and Cpr");
        System.out.println(infoEmployess.name() + infoEmployess.cpr());
        start();
        infoEmployess.emp1();
        infoEmployess.newLine();
        infoEmployess.emp2();
        infoEmployess.newLine();
        infoEmployess.emp3();
        infoEmployess.newLine();
        infoEmployess.emp4();
        infoEmployess.newLine();
        infoMembers.meb1();
        infoEmployess.newLine();
        infoMembers.meb2();
        infoEmployess.newLine();
        infoMembers.meb3();
        infoEmployess.newLine();
        infoMembers.meb4();
        end();
    }

    public static void printMembers(){
		System.out.println("FITNESS MEMBERS");
        System.out.println(infoMembers.name() + infoMembers.cpr() + infoMembers.memberType() + infoMembers.fee());
        start();
        members.meb1();
        infoEmployess.newLine();
        members.meb2();
        infoEmployess.newLine();
        members.meb3();
        infoEmployess.newLine();
        members.meb4();
        infoEmployess.newLine();
        end();
    }
}
