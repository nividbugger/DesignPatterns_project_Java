import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(){

        // factory design pattern
        employees.add(EmployeeFactory.getInstance().createEmployee(EmployeeFactory.EmployeeType.manager, new int[]{3,2}, new int[]{3}));
        employees.add(EmployeeFactory.getInstance().createEmployee(EmployeeFactory.EmployeeType.techlead, new int[]{1}, new int[]{2}));
        employees.add(EmployeeFactory.getInstance().createEmployee(EmployeeFactory.EmployeeType.developer, new int[]{}, new int[]{1}));
    }

    public Employee createEmployee(EmployeeFactory.EmployeeType employeeType, int[] openLevels, int[] executeLevels){
        return EmployeeFactory.getInstance().createEmployee(employeeType, openLevels, executeLevels);
    }

    public Task createTask(String taskName, String taskType, String taskStatus, Integer taskLevel, String taskSize, String effortRequired){
        return new Task(taskName, taskType, taskStatus, taskLevel, taskSize, effortRequired);
    }

    public void assignTask(Task task){

        //chain of responsibility
        for(Employee employee : employees){
            if(employee.open(task)){
                System.out.println("Opened by " + employee.getClass().getName());
                break;
            }
        }
        for(Employee employee : employees){
            if(employee.execute(task)){
                System.out.println("Executed by " + employee.getClass().getName());
                break;
            }
        }
    }
}
