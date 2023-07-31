

package packagecom.mycompany.prg.main08;

public class Main08 {

    public static void main(String[] args) {
        // Create an instance of the Item class using the constructor
        Item item = new Item(1, "Sword");
        item.setLocation("Main Storage");
        item.setDescription("A sharp weapon");

        // Create an instance of the Monster class using the constructor
        Monster monster1 = new Monster(2, "Zombie", 10);
        monster1.setLocation("Dungeon");
        monster1.setDescription("A scary undead creature");

        // Create another Monster using the constructor that takes itemId and itemName
        Monster monster2 = new Monster(3, "Skeleton");

        // Access and print the properties of the item and monsters
        System.out.println("Item ID: " + item.getItemId());
        System.out.println("Item Name: " + item.getItemName());
        System.out.println("Location: " + item.getLocation());
        System.out.println("Description: " + item.getDescription());

        System.out.println("Monster1 ID: " + monster1.getItemId());
        System.out.println("Monster1 Name: " + monster1.getItemName());
        System.out.println("Monster1 Attack Damage: " + monster1.getAttackDamage());
        System.out.println("Monster1 Location: " + monster1.getLocation());
        System.out.println("Monster1 Description: " + monster1.getDescription());

        System.out.println("Monster2 ID: " + monster2.getItemId());
        System.out.println("Monster2 Name: " + monster2.getItemName());
        System.out.println("Monster2 Attack Damage: " + monster2.getAttackDamage());
        System.out.println("Monster2 Location: " + monster2.getLocation());
        System.out.println("Monster2 Description: " + monster2.getDescription());
    }
}

