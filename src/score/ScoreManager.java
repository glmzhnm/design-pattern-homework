package score;
import player.Player;
public class ScoreManager {
    public static void displayFinalScore(Player player) {
        System.out.println("\nwin! " + player.getName() + " finished game with " + player.getExperience() + " experience!");
    }
}