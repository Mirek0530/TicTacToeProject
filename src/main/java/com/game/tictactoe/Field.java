package com.game.tictactoe;

import java.util.Map;

public class Field {

    private enum CellSign {
        X, O;
    }

    public void printField(Map<Integer, Integer> cells) {
        if (cells.size() == 9) {
            printField3x3(cells);
        }
        if (cells.size() == 100) {
            printField10x10(cells);
        }
    }

    private String mapCell(int cellStatus) {
        String sign = " ";
        switch (cellStatus) {
            case 0:
                break;
            case 1:
                sign = CellSign.X.toString();
                break;
            case 2:
                sign = CellSign.O.toString();
                break;
        }
        return sign;
    }

    private void printField3x3(Map<Integer, Integer> cells) {
        for (int i = 0; i < 3; i++) {
            System.out.println("|" + mapCell(cells.get(i * 3 + 1)) + "|" + mapCell(cells.get(i * 3 + 2)) + "|" + mapCell(cells.get(i * 3 + 3)) + "|");
        }
    }

    private void printField10x10(Map<Integer, Integer> cells) {
        for (int i = 0; i < 10; i++) {
            System.out.println("|" + mapCell(cells.get(i * 10 + 1)) + "|" + mapCell(cells.get(i * 10 + 2)) + "|"
                    + mapCell(cells.get(i * 10 + 3)) + "|" + mapCell(cells.get(i * 10 + 4)) + "|"
                    + mapCell(cells.get(i * 10 + 5)) + "|" + mapCell(cells.get(i * 10 + 6)) + "|"
                    + mapCell(cells.get(i * 10 + 7)) + "|" + mapCell(cells.get(i * 10 + 8)) + "|"
                    + mapCell(cells.get(i * 10 + 9)) + "|" + mapCell(cells.get(i * 10 + 10)) + "|");
        }
    }
}
