package com.game.tictactoe;

public class TicTacToeMessager {

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

    public void howToPlay() {
        System.out.println("--- HOW TO PLAY? ---");
        System.out.println("|1|2|3|");
        System.out.println("|4|5|6|");
        System.out.println("|7|8|9|");
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

    public void errorChoosingCell() {
        System.out.println("Error input! Choose cell again.");
    }

    public void errorCellIsOccupied() {
        System.out.println("Error! Chosen cell is currently occupied. Try again.");
    }

    public void printResult(String result) {
        System.out.println(result);
    }
}
