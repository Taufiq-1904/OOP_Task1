/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;

import task1.esports.*; // Langsung import semua Java Class tanpa satu persatu
/**
 *
 * @author candr
 */

public class Task1 {
    public static void main(String[] args) {
        Tournament mobaTournament = new MOBA_Tournament("MLBB Championship", 1000000, 10);
        Tournament fpsTournament = new FPS_Tournament("Valorant Masters", 2000000, 8);
        Tournament brTournament = new BattleRoyale_Tournament("PUBG Global", 3000000, 100);

        mobaTournament.startTournament();
        fpsTournament.startTournament();
        brTournament.startTournament();

        mobaTournament.calculateWinner();
        fpsTournament.calculateWinner();
        brTournament.calculateWinner();

        mobaTournament.endTournament();
        fpsTournament.endTournament();
        brTournament.endTournament();
    }
}

