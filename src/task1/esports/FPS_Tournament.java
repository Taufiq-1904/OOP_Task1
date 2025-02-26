/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1.esports;

/**
 *
 * @author candr
 */

public class FPS_Tournament extends Tournament implements GameRules {
    public FPS_Tournament(String name, int prizePool, int maxPlayers) {
        super(name, prizePool, maxPlayers);
    }

    @Override
    public void startTournament() {
        System.out.println("FPS Tournament " + name + " has started!");
    }

    @Override
    public void endTournament() {
        System.out.println("FPS Tournament " + name + " has ended!");
    }

    @Override
    public void calculateWinner() {
        System.out.println("Calculating winner for " + name + " based on kills and objectives!");
    }

    @Override
    public void setGameMode() {
        System.out.println("Game mode for " + name + " is Search and Destroy.");
    }

    @Override
    public void enforceRules() {
        System.out.println("No wallhacks or aimbots allowed in " + name + "!");
    }

    @Override
    public void determineDisqualification() {
        System.out.println("Players using hacks in " + name + " will be permanently banned!");
    }
}
