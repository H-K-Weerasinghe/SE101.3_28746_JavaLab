
package packagecom.mycompany.prg.main08;

public class Item 
{
   
    private int itemId;
    private String itemName;
    private String location;
    private String description;

    // Constructor that takes an integer and a string as arguments
    public Item(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    // Getters and setters for location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getters and setters for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getters and setters for itemId and itemName (optional, but good practice)
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Other methods and business logic for the Item class can be added here
}
