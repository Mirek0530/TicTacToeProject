package com.game.tictactoe;

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
        String result;
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
        boolean fiveInARow;
        int bound = (int) Math.sqrt(fieldSize);
        Integer winnerSignNumber = 0;

        if (bound < 5) {
            for (int i = 0; i <= bound - 3; i++) {
                for (int j = 0; j <= bound - 3; j++) {
                    threeInARow = (cellsMap.get(i * bound + 3 + j).equals(cellsMap.get(i * bound + 3 + bound - 1 + j)) &&
                            cellsMap.get(i * bound + 3 + bound - 1 + j).equals(cellsMap.get(i * bound + 3 + 2 * (bound - 1) + j)));
                    if (threeInARow && (cellsMap.get(i * bound + 3 + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i * bound + 3 + j);
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i <= bound - 5; i++)
                for (int j = 0; j <= bound - 5; j++) {
                    fiveInARow = (cellsMap.get(i * bound + 5 + j).equals(cellsMap.get(i * bound + 5 + bound - 1 + j)) &&
                            cellsMap.get(i * bound + 5 + bound - 1 + j).equals(cellsMap.get(i * bound + 5 + 2 * (bound - 1) + j)) &&
                            cellsMap.get(i * bound + 5 + 2 * (bound - 1) + j).equals(cellsMap.get(i * bound + 5 + 3 * (bound - 1) + j)) &&
                            cellsMap.get(i * bound + 5 + 3 * (bound - 1) + j).equals(cellsMap.get(i * bound + 5 + 4 * (bound - 1) + j)));
                    if (fiveInARow && (cellsMap.get(i * bound + 5 + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i * bound + 5 + j);
                        break;
                    }
                }
        }
        return winnerSignNumber;
    }

    private Integer checkDiagonalsFromTopToBottom() {
        boolean threeInARow;
        boolean fiveInARow;
        int bound = (int) Math.sqrt(fieldSize);
        Integer winnerSignNumber = 0;

        if (bound < 5) {
            for (int i = 0; i <= bound - 3; i++) {
                for (int j = 0; j <= bound - 3; j++) {
                    threeInARow = (cellsMap.get(i * bound + 1 + j).equals(cellsMap.get(i * bound + bound + 2 + j)) &&
                            cellsMap.get(i * bound + bound + 2 + j).equals(cellsMap.get(i * bound + 2 * bound + 3 + j)));
                    if (threeInARow && (cellsMap.get(i * bound + 1 + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i * bound + 1 + j);
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i <= bound - 5; i++)
                for (int j = 0; j <= bound - 5; j++) {
                    fiveInARow = (cellsMap.get(i * bound + 1 + j).equals(cellsMap.get(i * bound + bound + 2 + j)) &&
                            cellsMap.get(i * bound + bound + 2 + j).equals(cellsMap.get(i * bound + 2 * bound + 3 + j)) &&
                            cellsMap.get(i * bound + 2 * bound + 3 + j).equals(cellsMap.get(i * bound + 3 * bound + 4 + j)) &&
                            cellsMap.get(i * bound + 3 * bound + 4 + j).equals(cellsMap.get(i * bound + 4 * bound + 5 + j)));
                    if (fiveInARow && (cellsMap.get(i * bound + 1 + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i * bound + 1 + j);
                        break;
                    }
                }
        }
        return winnerSignNumber;
    }

    private Integer checkColumns() {
        boolean threeInARow;
        boolean fiveInARow;
        int bound = (int) Math.sqrt(fieldSize);
        Integer winnerSignNumber = 0;

        for (int i = 1; i <= bound; i++) {
            if (bound < 5) {
                for (int j = 0; j <= (bound - 3) * bound; j += bound) {
                    threeInARow = (cellsMap.get(i + j).equals(cellsMap.get(i + bound + j)) &&
                            cellsMap.get(i + bound + j).equals(cellsMap.get(i + 2 * bound + j)));
                    if (threeInARow && (cellsMap.get(i + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i + j);
                        break;
                    }
                }
            } else {
                for (int j = 0; j <= (bound - 5) * bound; j += bound) {
                    fiveInARow = (cellsMap.get(i + j).equals(cellsMap.get(i + bound + j)) &&
                            cellsMap.get(i + bound + j).equals(cellsMap.get(i + 2 * bound + j)) &&
                            cellsMap.get(i + 2 * bound + j).equals(cellsMap.get(i + 3 * bound + j)) &&
                            cellsMap.get(i + 3 * bound + j).equals(cellsMap.get(i + 4 * bound + j)));
                    if (fiveInARow && (cellsMap.get(i + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i + j);
                        break;
                    }
                }
            }
        }
        return winnerSignNumber;
    }

    private Integer checkRows() {
        boolean threeInARow;
        boolean fiveInARow;
        int bound = (int) Math.sqrt(fieldSize);
        Integer winnerSignNumber = 0;

        for (int i = 0; i < bound; i++) {
            if (bound < 5) {
                for (int j = 0; j <= (bound - 3); j++) {
                    threeInARow = (cellsMap.get(i * bound + 1 + j).equals(cellsMap.get(i * bound + 2 + j)) &&
                            cellsMap.get(i * bound + 2 + j).equals(cellsMap.get(i * bound + 3 + j)));
                    if (threeInARow && (cellsMap.get(i * bound + 1 + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i * bound + 1 + j);
                        break;
                    }
                }
            } else {
                for (int j = 0; j <= (bound - 5); j++) {
                    fiveInARow = (cellsMap.get(i * bound + 1 + j).equals(cellsMap.get(i * bound + 2 + j)) &&
                            cellsMap.get(i * bound + 2 + j).equals(cellsMap.get(i * bound + 3 + j)) &&
                            cellsMap.get(i * bound + 3 + j).equals(cellsMap.get(i * bound + 4 + j)) &&
                            cellsMap.get(i * bound + 4 + j).equals(cellsMap.get(i * bound + 5 + j)));
                    if (fiveInARow && (cellsMap.get(i * bound + 1 + j) != 0)) {
                        winnerSignNumber = cellsMap.get(i * bound + 1 + j);
                        break;
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
