package items;
import player.Player;
public abstract class ItemManager {
    protected String name;
    public ItemManager(String name) { this.name = name; }
    public abstract void applyEffect(Player player);
    public String getName() { return name; }
}