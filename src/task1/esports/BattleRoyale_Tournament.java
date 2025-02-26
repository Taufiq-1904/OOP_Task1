/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1.esports;

/**
 *
 * @author candr
 */

public class BattleRoyale_Tournament extends Tournament implements GameRules {
    public BattleRoyale_Tournament(String name, int prizePool, int maxPlayers) {
        super(name, prizePool, maxPlayers);
    }

    @Override
    public void startTournament() {
        System.out.println("Battle Royale Tournament " + name + " has started!");
    }

    @Override
    public void endTournament() {
        System.out.println("Battle Royale Tournament " + name + " has ended!");
    }

    @Override
    public void calculateWinner() {
        System.out.println("Winner of " + name + " is the last player standing!");
    }

    @Override
    public void setGameMode() {
        System.out.println("Game mode for " + name + " is Solo Survival.");
    }

    @Override
    public void enforceRules() {
        System.out.println("Teaming is not allowed in " + name + "!");
    }

    @Override
    public void determineDisqualification() {
        System.out.println("Players caught teaming in " + name + " will be disqualified!");
    }
}

