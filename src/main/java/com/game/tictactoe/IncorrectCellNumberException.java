package com.game.tictactoe;

public class IncorrectCellNumberException extends Exception {

    @Override
    public String getMessage() {
        return "Cell number outside of range!";
    }
}
