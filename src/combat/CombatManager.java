package combat;
import player.Player;
import enemies.Enemy;

public class CombatManager {
    public void fight(Player player, Enemy enemy) {
        System.out.println(player.getName() + " fight with " + enemy.getName() + "!");
        player.addHealth(-enemy.getDamage());
        player.addExperience(enemy.getExperience());
        System.out.println("Health = " + player.getHealth() + ", Experience = " + player.getExperience());
    }
}
