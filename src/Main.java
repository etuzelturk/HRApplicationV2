import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Department testDepartment = new Department();
        Employee luke = new Male("Luke","Skywalker", LocalDate.of(1968,5,25));
        Employee leia = new Female("Leia", "Organa", LocalDate.of(1966, 5, 25));
        Employee han = new Male("Han", "Solo", LocalDate.of(1965, 3, 15));
        Employee rey = new Female("Rey", "Skywalker", LocalDate.of(1990, 4, 11));

        testDepartment.addEmployee(luke);
        testDepartment.addEmployee(leia);
        testDepartment.addEmployee(han);
        testDepartment.addEmployee(rey);

        testDepartment.setTeamLeader(leia);

        testDepartment.addTask("Defeat the Empire");
        testDepartment.addTask("Train new Jedi");


        System.out.println("Test Department Employees:");
        for (Employee employee : testDepartment.getEmployeeList()) {
            System.out.println("Name: " + employee.getName() + " " + employee.getSurname() + ", Age: " + Period.between(employee.getBirthDate(), LocalDate.now()).getYears());
        }
        System.out.println("\n---------------------------------\n");
        System.out.println("Years until retirement:");
        for (Employee employee : testDepartment.getEmployeeList()) {
            System.out.println(employee.getName() + ": " + employee.calculateYearsToRetirement());
        }
        System.out.println("\n---------------------------------\n");
        if (testDepartment.getTeamLeader() != null) {
            System.out.println("Team Leader: " + testDepartment.getTeamLeader().getName() + " " + testDepartment.getTeamLeader().getSurname());
        } else {
            System.out.println("No team leader assigned.");
        }
        System.out.println("\n---------------------------------\n");

        System.out.println("Tasks:");
        for (String task : testDepartment.getTaskList()) {
            System.out.println(task);
        }
        System.out.println("\n -Defeat the Empire task is marked as completed.-\n");
        testDepartment.markTaskCompleted("Defeat the Empire");

        System.out.println("Current Tasks:");
        for (String task : testDepartment.getTaskList()) {
            System.out.println(task);
        }

    }
}