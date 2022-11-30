package com.game.tictactoe;

import java.util.Scanner;

import static com.game.tictactoe.MessagePrinter.MessageType.*;

public class Game {
    private final Database database;
    private final MessagePrinter printer;
    private final Scanner consoleInput;
    private boolean isGameModePlayerVsPlayer;
    private boolean isGameModeSelected = false;
    private boolean isMovePlayed = false;
    private final static int X_SIGN_NUMBER = 1;
    private final static int O_SIGN_NUMBER = 2;

    public Game() {
        database = new Database();
        printer = new MessagePrinter();
        consoleInput = new Scanner(System.in);
    }

    public void run() {
        boolean isEnd = false;

        printer.printMessage(WELCOME_MESSAGE);

        printer.printMessage(GAME_MODE_MESSAGE);
        setGameMode(consoleInput);

        printer.printMessage(CHOOSE_FIELD_SIZE_MESSAGE);
        setFieldSize(consoleInput);
        database.initializeCellsMap(database.getFieldSize());

        printer.howToPlay(database.getFieldSize());
        database.showStatus();

        while (!isEnd) {
            isMovePlayed = false;
            humanMove(X_SIGN_NUMBER);
            database.showStatus();

            if (database.isGameOver()) break;

            isMovePlayed = false;
            if (!isGameModePlayerVsPlayer) {
                computerMove(O_SIGN_NUMBER);
            } else {
                humanMove(O_SIGN_NUMBER);
            }
            database.showStatus();
            isEnd = database.isGameOver();
        }

        System.out.println(database.getResult());
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
                isMovePlayed = database.getNextMoveAndCheckIfPossible(chosenCellNumber, signNumber);
                if (!isMovePlayed) {
                    printer.printMessage(CELL_OCCUPIED_MESSAGE);
                }
            } catch (IncorrectCellNumberException | NumberFormatException exception) {
                printer.printExceptionMessage(exception.getMessage());
            }
        }
    }

    private void computerMove(int signNumber) {
        while (!isMovePlayed) {
            int generatedCellNumber = database.generateComputerMove();
            try {
                isMovePlayed = database.getNextMoveAndCheckIfPossible(generatedCellNumber, signNumber);
            } catch (IncorrectCellNumberException exception) {
                printer.printExceptionMessage(exception.getMessage());
            }
        }
        printer.printMessage(COMPUTER_MOVED_MESSAGE);
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
                    printer.printMessage(ERROR_SETTING_GAME_MODE_MESSAGE);
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
                     printer.printMessage(ERROR_SETTING_GAME_MODE_MESSAGE);
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
                printer.printMessage(ERROR_SETTING_FIELD_SIZE_MESSAGE);
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
