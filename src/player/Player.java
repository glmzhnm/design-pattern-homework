package player;
import items.ItemManager;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<ItemManager> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }
    public void addHealth(int amount) { health = Math.min(100, health + amount); }
    public void addExperience(int amount) { experience += amount; }
    public void addToInventory(ItemManager item) { inventory.add(item); }
    public int getHealth() { return health; }
    public int getExperience() { return experience; }
    public String getName() { return name; }
}
