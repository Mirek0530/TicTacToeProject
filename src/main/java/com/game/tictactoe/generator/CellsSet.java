package com.game.tictactoe.generator;

class CellsSet {

    private int firstCellNumber;
    private int secondCellNumber;
    private int thirdCellNumber;
    private int firstCellStatus;
    private int secondCellStatus;
    private int thirdCellStatus;

    public CellsSet(Cell firstCell, Cell secondCell, Cell thirdCell) {
        this.firstCellNumber = firstCell.getCellNumber();
        this.secondCellNumber = secondCell.getCellNumber();
        this.thirdCellNumber = thirdCell.getCellNumber();
        this.firstCellStatus = firstCell.getCellStatus();
        this.secondCellStatus = secondCell.getCellStatus();
        this.thirdCellStatus = thirdCell.getCellStatus();
    }

    public int findOneEmptyAndTwoOccupiedBySameSign(int signNumber) {
        int returnedCellNumber = 0;
        if ((((firstCellStatus == secondCellStatus) && (firstCellStatus != 0)) && (thirdCellStatus == 0)) && (signNumber == firstCellStatus)) {
            returnedCellNumber = thirdCellNumber;
        }
        if ((((firstCellStatus == thirdCellStatus) && (thirdCellStatus != 0)) && (secondCellStatus == 0)) && (signNumber == thirdCellStatus)) {
            returnedCellNumber = secondCellNumber;
        }
        if ((((secondCellStatus == thirdCellStatus) && (secondCellStatus != 0)) && (firstCellStatus == 0)) && (signNumber == secondCellStatus)) {
            returnedCellNumber = firstCellNumber;
        }
        return returnedCellNumber;
    }


}
