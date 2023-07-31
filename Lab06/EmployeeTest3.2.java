
package packagecom.mycompany.prg.employeetestt;

public class EmployeeTestt {

    public static void main(String[] args) {
       
        // Using constructor to initialize values and setting bonus using setter
        Employee emp = new Employee("John Doe", 50000.0, 3000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
    }
}

