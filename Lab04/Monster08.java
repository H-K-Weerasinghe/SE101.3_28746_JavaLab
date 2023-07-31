
package packagecom.mycompany.prg.main08;


public class Monster extends Item {
    private int attackDamage;

    // Constructor that takes integer, string, and attack damage as arguments
    public Monster(int itemId, String itemName, int attackDamage) {
        super(itemId, itemName); // Call the constructor of the superclass (Item)
        this.attackDamage = attackDamage;
    }

    // Constructor that takes integer and string as arguments
    public Monster(int itemId, String itemName) {
        super(itemId, itemName); // Call the constructor of the superclass (Item)
        // Default attack damage, you can set it to any appropriate value
        this.attackDamage = 0;
    }

    // Getter and setter for attackDamage
    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    // Additional methods and business logic for the Monster class can be added here
}
    

