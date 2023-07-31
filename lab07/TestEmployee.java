
package packagecom.mycompany.prg.testemployee;

public class TestEmployee {


    public static void main(String[] args) {
        // Create objects for Mr. Bogdan and Ms. Bird
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();

        // Set values for Mr. Bogdan using setters
        mrBogdan.setEmpID(101);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");

        // Set values for Ms. Bird using setters
        msBird.setEmpID(102);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("Project Manager");

        // Print the details using getters
        System.out.println("Mr. Bogdan Details:");
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println("\nMs. Bird Details:");
        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
}



