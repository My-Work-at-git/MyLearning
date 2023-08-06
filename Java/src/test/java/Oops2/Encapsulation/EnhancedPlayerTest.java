package Oops2.Encapsulation;

import org.example.Oops2.Encapsulation.EnhancedPlayer;

public class EnhancedPlayerTest {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Tim");
        System.out.println(player.healthRemaining());
        EnhancedPlayer player1 = new EnhancedPlayer("Brook", -5, "Sword");
        System.out.println(player1.healthRemaining());
    }

}
