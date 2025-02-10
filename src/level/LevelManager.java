package level;
import enemies.Enemy;
import enemies.Skeleton;
import enemies.Zombie;
import enemies.Vampire;
import items.ItemManager;
import items.GoldCoin;
import items.HealthElixir;
import items.MagicScroll;
import java.util.List;

public class LevelManager {
    public static void setupLevel(int level, List<Enemy> enemies, List<ItemManager> items) {
        enemies.clear();
        items.clear();
        switch (level) {
            case 1 -> {
                enemies.add(new Skeleton());
                enemies.add(new Zombie());
                items.add(new GoldCoin());
                items.add(new HealthElixir());
            }
            case 2 -> {
                enemies.add(new Vampire());
                items.add(new MagicScroll());
            }
            case 3 -> {
                enemies.add(new Vampire());
                enemies.add(new Zombie());
                items.add(new HealthElixir());
                items.add(new GoldCoin());
            }
        }
    }
}