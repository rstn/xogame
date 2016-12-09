package com.simbirsoft.xogame.base;

import com.simbirsoft.xogame.api.FieldLabel;
import com.simbirsoft.xogame.api.User;

/**
 * Реализация пользователя игры
 */
public class UserImpl implements User {

    private final FieldLabel label;
    private final String name;

    public UserImpl(FieldLabel label, String name) {
        this.label = label;
        this.name = name;
    }

    public FieldLabel getFieldLabel() {
        return label;
    }

    public String getName() {
        return name;
    }
}
