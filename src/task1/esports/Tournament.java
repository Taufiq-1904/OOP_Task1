/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1.esports;

/**
 *
 * @author candr
 */

public abstract class Tournament {
    protected String name;
    protected int prizePool;
    protected int maxPlayers;

    public Tournament(String name, int prizePool, int maxPlayers) {
        this.name = name;
        this.prizePool = prizePool;
        this.maxPlayers = maxPlayers;
    }

    public abstract void startTournament();
    public abstract void endTournament();
    public abstract void calculateWinner();
}
