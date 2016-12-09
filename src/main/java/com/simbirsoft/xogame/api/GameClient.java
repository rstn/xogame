package com.simbirsoft.xogame.api;

public interface GameClient {

    /**
     * Создать пользователя.
     *
     * @param label метка хода пользователя (Крестик или нолик)
     * @return новый пользователь
     */
    User createUser(FieldLabel label);

    /**
     * Выполнить ход
     *
     * @param user пользователь который осуществляет ход
     * @return ячейка на которую сходил пользователь
     */
    Field doStep(User user);

    /**
     * Нарисовать\обновить игровое поле для пользователя
     *
     * @param board данные об ихговором поле
     */
    void drawBoard(Board board);

    /**
     * Отобразить пользователю сообщение
     *
     * @param message сообщение
     */
    void showMessage(String message);

    /**
     * Сообщить об окончании игры
     * Очистить ресурсы
     */
    void endGame();
}
