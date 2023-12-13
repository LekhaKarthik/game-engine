package dev.lekha.gameengine;

import dev.lekha.gameengine.game.GameRunner;
import dev.lekha.gameengine.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
