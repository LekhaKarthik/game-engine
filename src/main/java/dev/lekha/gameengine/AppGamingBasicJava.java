package dev.lekha.gameengine;

import dev.lekha.gameengine.game.GameRunner;
import dev.lekha.gameengine.game.MarioGame;
import dev.lekha.gameengine.game.PacManGame;
import dev.lekha.gameengine.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

//        var game = new MarioGame();
        var game = new SuperContraGame();
//        var game = new PacManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
