package com.simbirsoft.xogame.base;

import com.simbirsoft.xogame.api.Board;
import com.simbirsoft.xogame.api.FieldLabel;

/**
 * Реализация игрового поля
 */
public class BoardImpl implements Board {

    @Override
    public void setField(FieldLabel label, int row, int column) {
    }

    @Override
    public FieldLabel getLabel(int row, int column) {
        return null;
    }

    @Override
    public Board getClonedBoard() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}


