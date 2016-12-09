package com.simbirsoft.xogame.console;

import com.simbirsoft.xogame.api.Board;

/**
 * Отрисовщик игового поля
 */
public interface BoardDrawer {

    /**
     * Нарисовать игровое поле
     *
     * @param board игровое поле
     */
    void draw(Board board);

}
