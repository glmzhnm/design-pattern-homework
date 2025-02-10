package items;
import player.Player;
public class GoldCoin extends ItemManager {
    public GoldCoin() { super("Gold Coin"); }
    public void applyEffect(Player player) { player.addExperience(5); }
}