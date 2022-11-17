package com.game.tictactoe;

public class MessagePrinter {

    public void welcomeMessage() {
        System.out.println("Hello! This is \"Tic-Tac-Toe\" game!");
    }

    public void chooseGameModeMessage() {
        System.out.println("Choose game mode: ");
        System.out.println("\"1\" - player vs player, \"2\" - player vs computer");
    }

    public void errorSettingGameMode() {
        System.out.println("Error setting game mode! Try again.");
    }

    public void howToPlay(int fieldSize) {
        System.out.println("--- HOW TO PLAY? ---");

        switch (fieldSize) {
            case 9:
                for (int i = 0; i < Math.sqrt(fieldSize); i++) {
                    System.out.println("|" + (i*3 + 1) + "|" + (i*3 + 2) + "|" + (i*3 + 3) + "|");
                }
                break;
            case 100:
                System.out.println("| 1| 2| 3| 4| 5| 6| 7| 8| 9|10|");
                for (int i = 1; i < Math.sqrt(fieldSize); i++) {
                    System.out.println("|" + (i*10 + 1) + "|" + (i*10 + 2) + "|" + (i*10 + 3) + "|" +
                            (i*10 + 4) + "|" + (i*10 + 5) + "|" + (i*10 + 6) + "|" +
                            (i*10 + 7) + "|" + (i*10 + 8) + "|" + (i*10 + 9) + "|" +
                            (i*10 + 10) + "|");
                }
                break;
        }

        System.out.println("Just choose number of cell where you want to put your sign.");
    }

    public void requestNextMove(int playerNumber) {
        switch (playerNumber) {
            case 1:
                System.out.println("Next move: Player1 - \"X\"");
                break;
            case 2:
                System.out.println("Next move: Player2 - \"O\"");
                break;
        }
    }

    public void errorCellIsOccupied() {
        System.out.println("Error! Chosen cell is currently occupied. Try again.");
    }

    public void printResult(String result) {
        System.out.println(result);
    }

    public void computerPlayed() {
        System.out.println("Computer's turn.");
    }

    public void print(String message) {
        System.out.println(message);
    }

    public void chooseFieldSize() {
        System.out.println("Choose field size: ");
        System.out.println("\"1\" - Classic 3x3, \"2\" - 10x10 (5 to win)");
    }

    public void errorSettingFieldSize() {
        System.out.println("Error setting field size! Try again.");
    }
}
