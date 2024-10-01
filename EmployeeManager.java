import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    private ArrayList<Employee> employeeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add new employee
    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, department, salary);
        employeeList.add(employee);
        System.out.println("Employee added successfully!");
    }

    // View all employees
    public void viewAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }

    // Update employee details
    public void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int id = scanner.nextInt();
        Employee employeeToUpdate = findEmployeeById(id);
        if (employeeToUpdate != null) {
            scanner.nextLine(); // Clear buffer
            System.out.print("Enter new Name: ");
            employeeToUpdate.setName(scanner.nextLine());
            System.out.print("Enter new Department: ");
            employeeToUpdate.setDepartment(scanner.nextLine());
            System.out.print("Enter new Salary: ");
            employeeToUpdate.setSalary(scanner.nextDouble());
            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Remove an employee
    public void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = scanner.nextInt();
        Employee employeeToRemove = findEmployeeById(id);
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
            System.out.println("Employee removed successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Find an employee by ID
    private Employee findEmployeeById(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
