package items;
import player.Player;
public class MagicScroll extends ItemManager {
    public MagicScroll() { super("Magic Scroll"); }
    public void applyEffect(Player player) { player.addExperience(14); }
}
