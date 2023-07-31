
package packagecom.mycompany.prg.testscenario;

public class TestScenario {

    public static void main(String[] args) 
    {
        // Create a Student object
        Student student = new Student();
        student.setName("John Doe");
        student.setId(1001);
        student.setCourse("Computer Science");

        // Create a Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Dr. Jane Smith");
        lecturer.setId(2001);
        lecturer.setProgramme("Computer Engineering");

        // Print the details of the Student and Lecturer
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Course: " + student.getCourse());

        System.out.println("\nLecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getId());
        System.out.println("Programme: " + lecturer.getProgramme());
    }
}

    

