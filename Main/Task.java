public class Task {

    private String taskName;
    private String taskType;
    private String taskStatus;
    private Integer taskLevel;
    private String taskSize;
    private String effortRequired;

    public Task(String taskName, String taskType, String taskStatus, Integer taskLevel, String taskSize, String effortRequired){
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskStatus = taskStatus;
        this.taskLevel = taskLevel;
        this.taskSize = taskSize;
        this.effortRequired = effortRequired;
    }

    public Integer getTaskLevel(){
        return this.taskLevel;
    }

}
