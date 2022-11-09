package com.game.tictactoe.generator;

class Cell {
    private int cellNumber;
    private int cellStatus;

    public Cell(int cellNumber, int cellStatus) {
        this.cellNumber = cellNumber;
        this.cellStatus = cellStatus;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public int getCellStatus() {
        return cellStatus;
    }
}
