package com.game.tictactoe;

import java.util.HashMap;
import java.util.Map;

public class TicTacToeDatabase {
    TicTacToeField field;
    Map<Integer, Integer> cellsMap;

    public TicTacToeDatabase() {
        field = new TicTacToeField();
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
}
