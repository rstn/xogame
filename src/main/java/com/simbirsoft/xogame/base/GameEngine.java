package com.simbirsoft.xogame.base;

import com.simbirsoft.xogame.api.Board;
import com.simbirsoft.xogame.api.Engine;
import com.simbirsoft.xogame.api.Field;

/**
 * Реализация игрового движка
 */
public class GameEngine implements Engine {

    private Board board;

    public GameEngine(int boardSize) {

    }


    @Override
    public boolean doStep(Field field) {
        return false;
    }

    @Override
    public boolean existWinner() {
        return false;
    }

    @Override
    public Board getBoard() {
        return null;
    }

    @Override
    public boolean existStep() {
        return false;
    }
}
