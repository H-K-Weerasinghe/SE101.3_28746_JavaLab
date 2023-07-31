
package packagecom.mycompany.prg.employeetestt;

public class Employee 
{

    private String name;
    private double basicSalary;
    private double bonus;

    // Constructor with bonus parameter
    public Employee(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
  

