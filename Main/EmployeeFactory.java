public class EmployeeFactory {

    public enum EmployeeType {manager, techlead, developer};

    // singleton
    private static EmployeeFactory employeeFactory = new EmployeeFactory();

    private EmployeeFactory(){

    }

    public static EmployeeFactory getInstance(){
        return employeeFactory;
    }

    public Employee createEmployee(final EmployeeType employeeType, int[] openLevels, int[] executeLevels){
        switch(employeeType){
            case manager:
                return (new Manager(openLevels, executeLevels));
            
            case techlead:
                return (new TechLead(openLevels, executeLevels));
            
            case developer:
                return (new Developer(openLevels, executeLevels));
            
            default: throw new IllegalArgumentException("Unsupported emp type " + employeeType);
        }
    }
}
