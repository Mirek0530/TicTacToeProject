package com.game.tictactoe;

import java.util.Scanner;

public class Game {
    private Database database;
    private MessagePrinter printer;
    private Scanner consoleInput;
    private boolean isGameModePlayerVsPlayer;
    private boolean isGameModeSelected = false;
    private boolean isEnd = false;
    private boolean isMovePlayed = false;
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

        printer.chooseFieldSize();
        setFieldSize(consoleInput);
        database.initializeCellsMap(database.getFieldSize());

        printer.howToPlay(database.getFieldSize());
        database.showStatus();

        while (!isEnd) {
            isMovePlayed = false;
            humanMove(X_SIGN_NUMBER);
            database.showStatus();
            isEnd = database.isGameOver();

            if (isEnd) break;

            isMovePlayed = false;
            if (!isGameModePlayerVsPlayer) {
                computerMove(O_SIGN_NUMBER);
            } else {
                humanMove(O_SIGN_NUMBER);
            }
            database.showStatus();
            isEnd = database.isGameOver();
        }

        database.getResult();
    }

    private void humanMove(int signNumber) {
        printer.requestNextMove(signNumber);
        getNextMove(consoleInput, signNumber);
    }

    public void getNextMove(Scanner input, int signNumber) {
        String inputEntry;
        int chosenCellNumber;

        while (!isMovePlayed) {
            inputEntry = input.next();
            try {
                chosenCellNumber = Integer.parseInt(inputEntry);
                isMovePlayed = database.getNextMoveAndCheckIfPossible(chosenCellNumber, signNumber, false);
            } catch (IncorrectCellNumberException | NumberFormatException exception) {
                printer.print(exception.getMessage());
            }
        }
    }

    private void computerMove(int signNumber) {
        while (!isMovePlayed) {
            int generatedCellNumber = database.generateComputerMove();
            try {
                isMovePlayed = database.getNextMoveAndCheckIfPossible(generatedCellNumber, signNumber, true);
            } catch (IncorrectCellNumberException exception) {
                printer.print(exception.getMessage());
            }
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

    private void setFieldSize(Scanner consoleInput) {
        String inputEntry = "";
        int fieldSizeSelection;

        while (true) {
            inputEntry = consoleInput.next();
            try {
                fieldSizeSelection = Integer.parseInt(inputEntry);
                break;
            } catch (NumberFormatException nfe) {
                printer.errorSettingFieldSize();
            }
        }

        switch (fieldSizeSelection) {
            case 1:
                database.setFieldSize(9);
                break;
            case 2:
                database.setFieldSize(100);
                break;
        }
    }
}
