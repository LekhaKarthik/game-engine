package dev.lekha.gameengine;

import dev.lekha.gameengine.game.GameRunner;
import dev.lekha.gameengine.game.MarioGame;
import dev.lekha.gameengine.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
