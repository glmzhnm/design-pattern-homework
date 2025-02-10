package items;
import player.Player;
public class HealthElixir extends ItemManager {
    public HealthElixir() { super("Health Elixir"); }
    public void applyEffect(Player player) { player.addHealth(20); }
}
