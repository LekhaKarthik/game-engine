package dev.lekha.gameengine;

import dev.lekha.gameengine.game.GameRunner;
import dev.lekha.gameengine.game.MarioGame;
import dev.lekha.gameengine.game.PacManGame;
import dev.lekha.gameengine.game.SuperContraGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {

//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacManGame();  // 1: Object creation
        var gameRunner = new GameRunner(game);  // 2: Object creation + Wiring of Dependency
        // game is a dependency of GameRunner class
        gameRunner.run();
    }
}
