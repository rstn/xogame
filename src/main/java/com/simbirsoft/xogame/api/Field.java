package com.simbirsoft.xogame.api;

/**
 * Ячейка игрового поля
 */
public class Field {
    /**
     * Метка игрового поля - крестик или нолик
     */
    public final FieldLabel label;
    /**
     * координата строки. Нумерация начинается с 0
     */
    public final int row;
    /**
     * Координата столбца. Нумерация начинается с 0
     */
    public final int column;

    public Field(FieldLabel label, int row, int column) {
        this.label = label;
        this.row = row;
        this.column = column;
    }
}
