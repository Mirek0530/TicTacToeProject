package com.game.tictactoe;

import java.util.Scanner;

public class Game {
    private Database database;
    private MessagePrinter printer;
    private Scanner consoleInput;
    boolean isGameModePlayerVsPlayer;
    boolean isGameModeSelected = false;
    boolean isEnd = false;
    boolean isMovePlayed = false;
    private final static int X_SIGN_NUMBER = 1;
    private final static int O_SIGN_NUMBER = 2;

    public Game() {
        database = new Database();
        printer = new MessagePrinter();
        consoleInput = new Scanner(System.in);
    }

    public void run() {
        printer.welcomeMessage();

        printer.chooseGameModeMessage();
        setGameMode(consoleInput);

        printer.howToPlay();
        database.showStatus();

        while (!isEnd) {
            isMovePlayed = false;
            printer.requestNextMove(1);
            getNextMove(consoleInput, X_SIGN_NUMBER);
            database.showStatus();
            isEnd = database.isGameOver();

            if (isEnd) break;

            isMovePlayed = false;
            if (!isGameModePlayerVsPlayer) {
                computerMove(O_SIGN_NUMBER);
            } else {
                printer.requestNextMove(2);
                getNextMove(consoleInput, O_SIGN_NUMBER);
            }

            database.showStatus();
            isEnd = database.isGameOver();
        }

        database.getResult();
    }

    public void getNextMove(Scanner input, int signNumber) {
        String inputEntry = "";
        int chosenCellNumber;

        while (!isMovePlayed) {
            while (true) {
                inputEntry = input.next();
                try {
                    chosenCellNumber = Integer.parseInt(inputEntry);
                    break;
                } catch (NumberFormatException nfe) {
                    printer.illegalArgument(nfe);
                }
            }

            if (chosenCellNumber >= 1 && chosenCellNumber <=9) {
                isMovePlayed = database.getNextMoveAndCheckIfPossible(chosenCellNumber, signNumber, false);
            } else {
                printer.wrongNumber();
            }
        }
    }

    private void computerMove(int signNumber) {
        while (!isMovePlayed) {
            int generatedCellNumber = database.generateComputerMove(signNumber);
            isMovePlayed = database.getNextMoveAndCheckIfPossible(generatedCellNumber, signNumber, true);
        }
        printer.computerPlayed();
    }

    private void setGameMode(Scanner input) {
        String inputEntry = "";
        int gameModeSelection;

        while (!isGameModeSelected) {
            while (true) {
                inputEntry = input.next();
                try {
                    gameModeSelection = Integer.parseInt(inputEntry);
                    break;
                } catch (NumberFormatException nfe) {
                    printer.errorSettingGameMode();
                }
            }

            switch (gameModeSelection) {
                 case 1:
                     isGameModePlayerVsPlayer = true;
                     isGameModeSelected = true;
                     break;
                 case 2:
                     isGameModePlayerVsPlayer = false;
                     isGameModeSelected = true;
                     break;
                 default:
                     isGameModeSelected = false;
                     printer.errorSettingGameMode();
            }
        }
    }
}
