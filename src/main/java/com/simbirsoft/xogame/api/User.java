package com.simbirsoft.xogame.api;

/**
 * Пользователь игры
 */
public interface User {

    /**
     * Получить метку пользователя. Крестик или Нолик
     *
     * @return
     */
    FieldLabel getFieldLabel();

    /**
     * Получить имя пользователя
     *
     * @return
     */
    String getName();

}
