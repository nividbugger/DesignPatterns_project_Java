public abstract class Employee {

    protected int[] openLevels;
    protected int[] executeLevels;

    public Employee(int[] openLevels, int[] executeLevels){
        this.openLevels = openLevels;
        this.executeLevels = executeLevels;
    }

    public boolean open(Task task) {

        int taskLevel = task.getTaskLevel();
        for(int level: openLevels){
            if(level == taskLevel){
                return true;
            }
        }
        return false;
        
    }

    public boolean execute(Task task) {

        int taskLevel = task.getTaskLevel();
        for(int level: executeLevels){
            if(level == taskLevel){
                return true;
            }
        }
        return false;
        
    }
}
