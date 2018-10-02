/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern.games;

import templatepattern.abstracts.Game;

/**
 *
 * @author cihan
 */
public class Football extends Game {

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
