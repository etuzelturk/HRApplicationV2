import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Department {

    private Employee teamLeader;
    private List<Employee> employeeList;
    private List<String> taskList;

    public Department() {
        this.teamLeader = null;
        this.employeeList = new ArrayList<>();
        this.taskList = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setTeamLeader(Employee teamLeader) {
        if (teamLeader != null) {
            this.teamLeader = teamLeader;
        } else {
            throw new IllegalArgumentException("Team leader cannot be null");
        }
    }

    public Employee getTeamLeader() {
        return teamLeader;
    }

    public void addTask(String task) {
        taskList.add(task);
    }

    public void markTaskCompleted(String task) {
        taskList.remove(task);
    }

    public List<String> getTaskList() {
        return taskList;
    }
}
