public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Task task1 = company.createTask("Task 1", "Type 1", "Status 1", 1, "Size 1", "Effort 1");
        Task task2 = company.createTask("Task 2", "Type 2", "Status 2", 2, "Size 2", "Effort 2");
        Task task3 = company.createTask("Task 3", "Type 3", "Status 3", 3, "Size 3", "Effort 3");

        System.out.println("For task of level 1:");
        company.assignTask(task1);
        System.out.println();

        System.out.println("For task of level 2:");
        company.assignTask(task2);
        System.out.println();

        System.out.println("For task of level 3:");
        company.assignTask(task3);
        System.out.println();
    }
}
