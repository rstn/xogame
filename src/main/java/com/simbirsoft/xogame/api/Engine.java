package com.simbirsoft.xogame.api;

/**
 * Игровой движок, реализующий логику создания игрового поля и выполнения ходов
 */
public interface Engine {

    /**
     * Выполнить ход
     *
     * @param field поле на доске на которое ходит игрок
     * @return true, если поле еще не занято и игрок может выполнить на него ход, иначе false
     */
    boolean doStep(Field field);

    /**
     * проверить существование победителя
     *
     * @return true победитель есть, иначе false
     */
    boolean existWinner();

    /**
     * Получить данные о ходах игроков в виде игрового поля
     *
     * @return игровое поле
     */
    Board getBoard();

    /**
     * Проверить остались ли еще ходы у игроков
     *
     * @return true еще есть свободные клетки, а значит и ходы, иначе false
     */
    boolean existStep();
}
