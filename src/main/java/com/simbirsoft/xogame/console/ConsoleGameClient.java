package com.simbirsoft.xogame.console;

import com.simbirsoft.xogame.api.*;

/**
 * Клиент консольной игры крестики нолики.
 */
public class ConsoleGameClient implements GameClient {

    private BoardDrawer boardDrawer = new ConsoleBoardDrawer();


    @Override
    public User createUser(FieldLabel label) {
        return null;
    }

    @Override
    public Field doStep(User user) {
        return null;
    }

    @Override
    public void drawBoard(Board board) {
        boardDrawer.draw(board);
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void endGame() {

    }
}
