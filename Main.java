import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    employeeManager.addEmployee();
                    break;
                case 2:
                    employeeManager.viewAllEmployees();
                    break;
                case 3:
                    employeeManager.updateEmployee();
                    break;
                case 4:
                    employeeManager.removeEmployee();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
