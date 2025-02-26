/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1.esports;

/**
 *
 * @author candr
 */

public class MOBA_Tournament extends Tournament implements GameRules {
    public MOBA_Tournament(String name, int prizePool, int maxPlayers) {
        super(name, prizePool, maxPlayers);
    }

    @Override
    public void startTournament() {
        System.out.println("MOBA Tournament " + name + " has started!");
    }

    @Override
    public void endTournament() {
        System.out.println("MOBA Tournament " + name + " has ended!");
    }

    @Override
    public void calculateWinner() {
        System.out.println("Calculating winner for " + name + " based on team performance!");
    }

    @Override
    public void setGameMode() {
        System.out.println("Game mode for " + name + " is 5v5 Ranked Match.");
    }

    @Override
    public void enforceRules() {
        System.out.println("No cheating or scripting allowed in " + name + "!");
    }

    @Override
    public void determineDisqualification() {
        System.out.println("Players caught cheating in " + name + " will be disqualified!");
    }
}
