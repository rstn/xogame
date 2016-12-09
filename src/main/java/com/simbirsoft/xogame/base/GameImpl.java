package com.simbirsoft.xogame.base;

import com.simbirsoft.xogame.api.*;

public class GameImpl implements Game {

    private static int BOARD_SIZE = 3;

    private GameClient gameClient;

    public GameImpl(GameClient gameClient) {
        this.gameClient = gameClient;
    }

    public void start() {
        Engine gameEngine = new GameEngine(BOARD_SIZE);
        User user1 = gameClient.createUser(FieldLabel.X);
        User user2 = gameClient.createUser(FieldLabel.O);

        User curUser = user2;
        do {
            curUser = curUser == user1 ? user2 : user1;
            gameClient.drawBoard(gameEngine.getBoard());
            do {
                Field field = gameClient.doStep(curUser);
                if (gameEngine.doStep(field)) {
                    break;
                } else {
                    gameClient.showMessage("Поле занято. Попробуйте еще раз");
                }
            } while (true);
        } while (!gameEngine.existWinner() && gameEngine.existStep());
        if (gameEngine.existWinner()) {
            gameClient.drawBoard(gameEngine.getBoard());
            gameClient.showMessage("Победил пользователь " + curUser.getName() + ". Игра завершена");
        } else {
            gameClient.showMessage("Ходов больше нет. Ничья");
        }
        gameClient.endGame();
    }
}
