package com.game.tictactoe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicTacToeData {
    TicTacToeField field;
    TicTacToeMessager messager;
    Map<Integer, Integer> cellsMap;

    public TicTacToeData() {
        field = new TicTacToeField();
        messager = new TicTacToeMessager();
        cellsMap = initializeCellsMap();
    }

    public Map<Integer, Integer> initializeCellsMap() {
        Map<Integer, Integer> localMap = new HashMap<>();
        localMap.put(1, 0);
        localMap.put(2, 0);
        localMap.put(3, 0);
        localMap.put(4, 0);
        localMap.put(5, 0);
        localMap.put(6, 0);
        localMap.put(7, 0);
        localMap.put(8, 0);
        localMap.put(9, 0);

        return localMap;
    }

    public void showStatus() {
        for (Map.Entry<Integer, Integer> cell : cellsMap.entrySet()) {
            mapCells(cell.getKey(), cell.getValue());
        }
        field.printField();
    }

    public void mapCells(Integer cellNumber, Integer cellStatus) {
        switch (cellNumber) {
            case 1:
                field.setField1_1(mapCellStatus(cellStatus));
            case 2:
                field.setField1_2(mapCellStatus(cellStatus));
            case 3:
                field.setField1_3(mapCellStatus(cellStatus));
            case 4:
                field.setField2_1(mapCellStatus(cellStatus));
            case 5:
                field.setField2_2(mapCellStatus(cellStatus));
            case 6:
                field.setField2_3(mapCellStatus(cellStatus));
            case 7:
                field.setField3_1(mapCellStatus(cellStatus));
            case 8:
                field.setField3_2(mapCellStatus(cellStatus));
            case 9:
                field.setField3_3(mapCellStatus(cellStatus));
        }
    }

    public char mapCellStatus(Integer cellStatus) {
        char sign = ' ';
        switch (cellStatus) {
            case 0:
                break;
            case 1:
                sign = 'X';
                break;
            case 2:
                sign = 'O';
                break;
        }
        return sign;
    }

    public void getResult() {
        String result = "";
        if (checkWinLose() == 0 && checkAllOccupied()) {
            result = "Draw!";
        } else {
            result = "Player" + checkWinLose() + " wins!";
        }
        messager.printResult(result);
    }

    public boolean isGameOver() {
        boolean gameOver;

        gameOver = (checkWinLose() > 0) || (checkWinLose() == 0 && checkAllOccupied());

        return gameOver;
    }

    public int checkWinLose() {
        int winner = 0;
        List<Integer> cellsStatus = new ArrayList<>();
        cellsStatus.add(cellsMap.get(1) * cellsMap.get(2) * cellsMap.get(3));
        cellsStatus.add(cellsMap.get(4) * cellsMap.get(5) * cellsMap.get(6));
        cellsStatus.add(cellsMap.get(7) * cellsMap.get(8) * cellsMap.get(9));
        cellsStatus.add(cellsMap.get(1) * cellsMap.get(4) * cellsMap.get(7));
        cellsStatus.add(cellsMap.get(2) * cellsMap.get(5) * cellsMap.get(8));
        cellsStatus.add(cellsMap.get(3) * cellsMap.get(6) * cellsMap.get(9));
        cellsStatus.add(cellsMap.get(1) * cellsMap.get(5) * cellsMap.get(9));
        cellsStatus.add(cellsMap.get(7) * cellsMap.get(5) * cellsMap.get(3));

        for (Integer i : cellsStatus) {
            if (i == 1) {
                winner = 1;
                break;
            }
            if (i == 8) {
                winner = 2;
                break;
            }
        }

        return winner;
    }

    public boolean checkAllOccupied() {
        boolean allOccupied = true;

        for (Map.Entry<Integer, Integer> cell : cellsMap.entrySet()) {
            if (cell.getValue() == 0) {
                allOccupied = false;
                break;
            }
        }
        return allOccupied;
    }

    public boolean getNextMoveAndCheckIfPossible(int cellNumber, int signNumber) {
        boolean isPossible = false;
        if (cellsMap.get(cellNumber) == 0) {
            cellsMap.remove(cellNumber);
            cellsMap.put(cellNumber, signNumber);
            isPossible = true;
        } else {
            messager.errorCellIsOccupied();
        }
        return isPossible;
    }
}
