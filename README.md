# Игра крестики нолики

## Задание 1
* Реализовать следующие методы класса com.simbirsoft.xogame.base.BoardImpl, реализующий модель игрового поля
    * `com.simbirsoft.xogame.base.BoardImpl.setField`
    * `com.simbirsoft.xogame.base.BoardImpl.getLabel`
    * `com.simbirsoft.xogame.base.BoardImpl.getClonedBoard`
    * `com.simbirsoft.xogame.base.BoardImpl.getSize`
* Реализовать следующие методы класса `com.simbirsoft.xogame.base.GameEngine.GameEngine`, реализующий отображение 
игрового поля в консоли
    * `com.simbirsoft.xogame.console.ConsoleBoardDrawer.draw`
* Реализовать следующие методы класса `com.simbirsoft.xogame.console.ConsoleGameClient`, необходимые для взаимодействия 
пользователя и игры:
    * `com.simbirsoft.xogame.api.ConsoleGameClient.createUser`
    * `com.simbirsoft.xogame.api.ConsoleGameClient.doStep`
    * `com.simbirsoft.xogame.api.ConsoleGameClient.drawBoard`
    * `com.simbirsoft.xogame.console.ConsoleGameClient.endGame`
* Реализовать следующие методы класса `com.simbirsoft.xogame.base.GameEngine.GameEngine`, реализующий игровой движок
    * `com.simbirsoft.xogame.base.GameEngine.GameEngine`
    * `com.simbirsoft.xogame.base.GameEngine.doStep`
    * `com.simbirsoft.xogame.base.GameEngine.existWinner`
    * `com.simbirsoft.xogame.base.GameEngine.getBoard`
    * `com.simbirsoft.xogame.base.GameEngine.existStep`

## Задание 1.1 доп. фича
* Внести изменения в код таким образом, чтобы у пользователя была возможность выбора играть с ИИ или с другим пользователем.
Реализовать ИИ для случая когда пользователь решил играть с компьютером

## Задание 1.1 альтернативное 
* Написать юнит тесты для вновь реализованных методоы