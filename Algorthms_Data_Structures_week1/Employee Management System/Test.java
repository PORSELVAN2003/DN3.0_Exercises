public class Test {
    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager(10);

        Employee emp1 = new Employee(1, "Arnab Koley", "Developer", 75000);
        Employee emp2 = new Employee(2, "Shreya Nandy", "Designer", 65000);
        Employee emp3 = new Employee(3, "Rahul Singh", "Manager", 85000);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        System.out.println("All Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee searchedEmp = manager.searchEmployeeById(2);
        if (searchedEmp != null) {
            System.out.println(searchedEmp);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee with ID 3:");
        manager.deleteEmployeeById(3);
        manager.traverseEmployees();
    }
}

