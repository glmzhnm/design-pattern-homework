import java.util.*;
import player.Player;
import combat.CombatManager;
import level.LevelManager;
import score.ScoreManager;
import enemies.Enemy;
import items.ItemManager;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        Player player = new Player(name);
        CombatManager combatManager = new CombatManager();
        List<Enemy> enemies = new ArrayList<>();
        List<ItemManager> items = new ArrayList<>();
        int currentLevel = 1;
        LevelManager.setupLevel(currentLevel, enemies, items);

        while (player.getHealth() > 0 && currentLevel <= 3) {
            while (!enemies.isEmpty() && player.getHealth() > 0) {
                combatManager.fight(player, enemies.remove(0));
            }
            while (!items.isEmpty()) {
                ItemManager item = items.remove(0);
                item.applyEffect(player);
                System.out.println(player.getName() + " picked " + item.getName());
            }
            if (player.getHealth() > 0 && currentLevel < 3) {
                currentLevel++;
                LevelManager.setupLevel(currentLevel, enemies, items);
                System.out.println("\n=== Level " + currentLevel + " ===");
            } else {
                break;
            }
        }
        if (player.getHealth() <= 0) {
            System.out.println("\nGAME OVER! " + player.getName() + " END...");
        } else {
            ScoreManager.displayFinalScore(player);
        }
    }
}