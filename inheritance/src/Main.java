public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.submitTimesheet();
        emp.bookVacation();
        emp.performWork();

        System.out.println();

        Programmer programmer = new Programmer();
        programmer.submitTimesheet();
        programmer.bookVacation();
        programmer.performWork();

        System.out.println();

        Tester tester = new Tester();
        tester.submitTimesheet();
        tester.bookVacation();
        tester.performWork();

        System.out.println();

        WebProgrammer wep = new WebProgrammer();

        wep.submitTimesheet();
        wep.bookVacation();
        wep.performWork();
        wep.createWebsite();
    }
}
