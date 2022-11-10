package com.game.tictactoe.generator;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class ComputerMoveGenerator {

    /*public static void main(String[] args) {
        Map<Integer, Integer> cellsMap = new HashMap<>();
        cellsMap.put(1, 1);
        cellsMap.put(2, 0);
        cellsMap.put(3, 1);
        cellsMap.put(4, 0);
        cellsMap.put(5, 1);
        cellsMap.put(6, 0);
        cellsMap.put(7, 2);
        cellsMap.put(8, 0);
        cellsMap.put(9, 2);

        int move = generateComputerMove(cellsMap, 2);
        System.out.println(move);
    }*/

    public static int generateComputerMove(Map<Integer, Integer> cellsMap, int signNumber) {
        Random random = new Random();
        int randomlyGeneratedMove = random.nextInt(9) + 1;
        int finalMove = 0;

        int signsAlreadyExistedCounter = 0;
        for (Map.Entry<Integer, Integer> cell : cellsMap.entrySet()) {
            if (cell.getValue() == signNumber) {
                signsAlreadyExistedCounter++;
            }
        }
        if (signsAlreadyExistedCounter <= 1) {
            finalMove = randomlyGeneratedMove;
        }

        if (signsAlreadyExistedCounter >= 2) {
            int temporaryMove = findNextMove(cellsMap, signNumber);
            if (temporaryMove != 0) {
                finalMove = temporaryMove;
            } else {
                finalMove = randomlyGeneratedMove;
            }
        }

        return finalMove;
    }

    public static int findNextMove(Map<Integer, Integer> cellsMap, int signNumber) {
        CellsSetCollector csc = new CellsSetCollector(cellsMap);

        ArrayList<Integer> moves = csc.findNextComputerMoves(signNumber);
        int nextMove = 0;

        if (!moves.isEmpty()) {
            Random random = new Random();
            int choosenMove = random.nextInt(moves.size());
            nextMove = moves.get(choosenMove);
        }

        return nextMove;
    }
}

