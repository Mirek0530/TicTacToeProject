package com.game.tictactoe;

import com.game.tictactoe.generator.ComputerMoveGenerator;

import java.util.*;

public class Database {
    Field field;
    MessagePrinter printer;
    Map<Integer, Integer> cellsMap = new HashMap<>();

    private int fieldSize;

    public Database() {
        field = new Field();
        printer = new MessagePrinter();
    }

    public void initializeCellsMap(int fieldSize) {
        HashMap<Integer, Integer> localMap = new HashMap<>();
        for (int i = 1; i <= fieldSize; i++) {
            localMap.put(i, 0);
        }

        this.cellsMap = localMap;
    }

    public void showStatus() {
        field.printField(cellsMap);
    }

    public void getResult() {
        String result = "";
        if (checkWinLose() == 0 && checkAllOccupied()) {
            result = "Draw!";
        } else {
            result = "Player" + checkWinLose() + " wins!";
        }
        printer.printResult(result);
    }

    public boolean isGameOver() {
        boolean gameOver;

        gameOver = (checkWinLose() > 0) || (checkWinLose() == 0 && checkAllOccupied());

        return gameOver;
    }

    public int checkWinLose() {
        int winner = 0;
        ArrayList<Integer> results = new ArrayList<>();

        results.add(checkRows());
        results.add(checkColumns());
        results.add(checkDiagonalsFromTopToBottom());
        results.add(checkDiagonalsFromBottomToTop());

        if (results.contains(1)) {
            winner = 1;
        }
        if (results.contains(2)) {
            winner = 2;
        }
        return winner;
    }

    private Integer checkDiagonalsFromBottomToTop() {
        boolean threeInARow;
        boolean fiveInARow = false;
        Integer winnerSignNumber = 0;

        if (fieldSize == 9) {
            threeInARow = (cellsMap.get(7).equals(cellsMap.get(5))) && (cellsMap.get(5).equals(cellsMap.get(3)));
            if (threeInARow && (cellsMap.get(7) != 0)) {
                winnerSignNumber = cellsMap.get(7);
            }
        }
        if (fieldSize == 100) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++){
                    fiveInARow = (cellsMap.get(i * 10 + 5 + j).equals(cellsMap.get(i * 10 + 14 + j)) &&
                            cellsMap.get(i * 10 + 14 + j).equals(cellsMap.get(i * 10 + 23 + j)) &&
                            cellsMap.get(i * 10 + 23 + j).equals(cellsMap.get(i * 10 + 32 + j)) &&
                            cellsMap.get(i * 10 + 32 + j).equals(cellsMap.get(i * 10 + 41 + j)));
                    if (fiveInARow && (cellsMap.get(i * 10 + 5 + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i * 10 + 5 + j);
                    }
                }
            }
        }
        return winnerSignNumber;
    }

    private Integer checkDiagonalsFromTopToBottom() {
        boolean threeInARow;
        boolean fiveInARow = false;
        Integer winnerSignNumber = 0;

        if (fieldSize == 9) {
            threeInARow = (cellsMap.get(1).equals(cellsMap.get(5))) && (cellsMap.get(5).equals(cellsMap.get(9)));
            if (threeInARow && (cellsMap.get(1) != 0)) {
                winnerSignNumber = cellsMap.get(1);
            }
        }
        if (fieldSize == 100) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++){
                    fiveInARow = (cellsMap.get(i * 10 + 1 + j).equals(cellsMap.get(i * 10 + 12 + j)) &&
                            cellsMap.get(i * 10 + 12 + j).equals(cellsMap.get(i * 10 + 23 + j)) &&
                            cellsMap.get(i * 10 + 23 + j).equals(cellsMap.get(i * 10 + 34 + j)) &&
                            cellsMap.get(i * 10 + 34 + j).equals(cellsMap.get(i * 10 + 45 + j)));
                    if (fiveInARow && (cellsMap.get(i * 10 + 1 + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i * 10 + 1 + j);
                    }
                }
            }
        }
        return winnerSignNumber;
    }

    private Integer checkColumns() {
        boolean threeInARow;
        boolean fiveInARow = false;
        Integer winnerSignNumber = 0;

        if (fieldSize == 9) {
            for (int i = 1; i <= 3; i++) {
                threeInARow = (cellsMap.get(i).equals(cellsMap.get(i + 3))) && (cellsMap.get(i + 3).equals(cellsMap.get(i + 6)));
                if (threeInARow && (cellsMap.get(i) != 0)) {
                    winnerSignNumber = cellsMap.get(i);
                }
            }
        }
        if (fieldSize == 100) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j < 60; j += 10) {
                    fiveInARow = (cellsMap.get(i + j).equals(cellsMap.get(i + 10 + j)) &&
                            cellsMap.get(i + 10 + j).equals(cellsMap.get(i + 20 + j)) &&
                            cellsMap.get(i + 20 + j).equals(cellsMap.get(i + 30 + j)) &&
                            cellsMap.get(i + 30 + j).equals(cellsMap.get(i + 40 + j)));
                    if (fiveInARow && (cellsMap.get(i + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i + j);
                    }
                }
            }
        }
        return winnerSignNumber;
    }

    private Integer checkRows() {
        boolean threeInARow;
        boolean fiveInARow;
        Integer winnerSignNumber = 0;

        if (fieldSize == 9) {
            for (int i = 0; i < 3; i++) {
                threeInARow = (cellsMap.get(i * 3 + 1).equals(cellsMap.get(i * 3 + 2)) &&
                        cellsMap.get(i * 3 + 2).equals(cellsMap.get(i * 3 + 3)));
                if (threeInARow && (cellsMap.get(i * 3 + 1) != 0)) {
                    winnerSignNumber = cellsMap.get(i * 3 + 1);
                }
            }
        }
        if (fieldSize == 100) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 6; j++) {
                    fiveInARow = (cellsMap.get(i * 10 + 1 + j).equals(cellsMap.get(i * 10 + 2 + j)) &&
                            cellsMap.get(i * 10 + 2 + j).equals(cellsMap.get(i * 10 + 3 + j)) &&
                            cellsMap.get(i * 10 + 3 + j).equals(cellsMap.get(i * 10 + 4 + j)) &&
                            cellsMap.get(i * 10 + 4 + j).equals(cellsMap.get(i * 10 + 5 + j)));
                    if (fiveInARow && (cellsMap.get(i * 10 + 1 + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i * 10 + 1 + j);
                    }
                }
            }
        }
        return winnerSignNumber;
    }

    private boolean checkAllOccupied() {
        boolean allOccupied = true;

        for (Map.Entry<Integer, Integer> cell : cellsMap.entrySet()) {
            if (cell.getValue() == 0) {
                allOccupied = false;
                break;
            }
        }
        return allOccupied;
    }

    public boolean getNextMoveAndCheckIfPossible(int cellNumber, int signNumber, boolean botPlayed) throws IncorrectCellNumberException {
        boolean isPossible = false;

        if ((cellNumber < 1) || (cellNumber > cellsMap.size())) {
            throw new IncorrectCellNumberException();
        }
        else {
            if (cellsMap.get(cellNumber) == 0) {
                cellsMap.remove(cellNumber);
                cellsMap.put(cellNumber, signNumber);
                isPossible = true;
            } else {
                if (!botPlayed) {
                    printer.errorCellIsOccupied();
                }
            }
        }
        return isPossible;
    }

    public int generateComputerMove() {
        Random generator = new Random();

        return generator.nextInt(cellsMap.size()) + 1;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public int getFieldSize() {
        return fieldSize;
    }
}
