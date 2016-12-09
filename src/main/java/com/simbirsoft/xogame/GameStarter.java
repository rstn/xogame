package com.simbirsoft.xogame;

import com.simbirsoft.xogame.api.Game;
import com.simbirsoft.xogame.base.GameImpl;
import com.simbirsoft.xogame.console.ConsoleGameClient;

/**
 * Класс для запуска консольной игры
 */
public class GameStarter {

    public static void main(String[] args) {
        Game game = new GameImpl(new ConsoleGameClient());
        game.start();
    }
}
