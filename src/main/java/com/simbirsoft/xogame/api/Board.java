package com.simbirsoft.xogame.api;

/**
 * Информация об игровом поле
 */
public interface Board {

    /**
     * Установить крестик или нолик в "ячейку" поля
     *
     * @param label  метка поля - крестик или нолик
     * @param row    строка поля
     * @param column столбец поля
     */
    void setField(FieldLabel label, int row, int column);

    /**
     * Получить метку поля по координатам
     *
     * @param row    строка
     * @param column столбец
     * @return метка поля
     */
    FieldLabel getLabel(int row, int column);

    /**
     * Получить копию игрового поля
     *
     * @return копия игрового поля
     */
    Board getClonedBoard();

    /**
     * Получить размер игрового поля
     *
     * @return размер игрового поля
     */
    int getSize();
}
