package com.game.tictactoe.generator;

import java.util.ArrayList;
import java.util.Map;

class CellsSetCollector {
    ArrayList<CellsSet> cellsSetArrayList = new ArrayList<>();

    public CellsSetCollector(Map<Integer, Integer> cellsMap) {
        cellsSetArrayList.add(new CellsSet(new Cell(1, cellsMap.get(1)), new Cell(2, cellsMap.get(2)), new Cell(3, cellsMap.get(3))));
        cellsSetArrayList.add(new CellsSet(new Cell(4, cellsMap.get(4)), new Cell(5, cellsMap.get(5)), new Cell(6, cellsMap.get(6))));
        cellsSetArrayList.add(new CellsSet(new Cell(7, cellsMap.get(7)), new Cell(8, cellsMap.get(8)), new Cell(9, cellsMap.get(9))));
        cellsSetArrayList.add(new CellsSet(new Cell(1, cellsMap.get(1)), new Cell(4, cellsMap.get(4)), new Cell(7, cellsMap.get(7))));
        cellsSetArrayList.add(new CellsSet(new Cell(2, cellsMap.get(2)), new Cell(5, cellsMap.get(5)), new Cell(8, cellsMap.get(8))));
        cellsSetArrayList.add(new CellsSet(new Cell(3, cellsMap.get(3)), new Cell(6, cellsMap.get(6)), new Cell(9, cellsMap.get(9))));
        cellsSetArrayList.add(new CellsSet(new Cell(1, cellsMap.get(1)), new Cell(5, cellsMap.get(5)), new Cell(9, cellsMap.get(9))));
        cellsSetArrayList.add(new CellsSet(new Cell(7, cellsMap.get(7)), new Cell(5, cellsMap.get(5)), new Cell(3, cellsMap.get(3))));
    }

    public ArrayList<Integer> findNextComputerMoves(int signNumber) {
        ArrayList<Integer> movesList = new ArrayList<>();
        int nextMoveNumber;
        for (CellsSet cellsSet : cellsSetArrayList) {
            nextMoveNumber = cellsSet.findOneEmptyAndTwoOccupiedBySameSign(signNumber);
            if (nextMoveNumber != 0) {
                movesList.add(nextMoveNumber);
            }
        }

        return movesList;
    }
}
