package com.game.tictactoe;

public class MessagePrinter {
    public static final String WELCOME_MESSAGE = "Hello! This is \"Tic-Tac-Toe\" game!";
    public static final String GAME_MODE_MESSAGE = "Choose game mode: \n\"1\" - player vs player, \"2\" - player vs computer";
    public static final String ERROR_SETTING_GAME_MODE_MESSAGE = "Error setting game mode! Try again.";
    public static final String COMPUTER_MOVED_MESSAGE = "Computer's turn.";
    public static final String CHOOSE_FIELD_SIZE_MESSAGE = "Choose field size: \n\"1\" - Classic 3x3, \"2\" - 10x10 (5 to win)";
    public static final String ERROR_SETTING_FIELD_SIZE_MESSAGE = "Error setting field size! Try again.";
    public static final String CELL_OCCUPIED_MESSAGE = "Cell is already occupied. Try again!";

    enum MessageType {
        WELCOME_MESSAGE("Hello! This is \"Tic-Tac-Toe\" game!"),
        GAME_MODE_MESSAGE("Choose game mode: \n\"1\" - player vs player, \"2\" - player vs computer"),
        ERROR_SETTING_GAME_MODE_MESSAGE("Error setting game mode! Try again."),
        COMPUTER_MOVED_MESSAGE("Computer's turn"),
        CHOOSE_FIELD_SIZE_MESSAGE("Choose field size: \n\"1\" - Classic 3x3, \"2\" - 10x10 (5 to win)"),
        ERROR_SETTING_FIELD_SIZE_MESSAGE("Error setting field size! Try again."),
        CELL_OCCUPIED_MESSAGE("Cell is already occupied. Try again!");

        MessageType(String s) {

        }
    }

    public void printMessage(MessageType messageType) {
        switch (messageType) {
            case WELCOME_MESSAGE:
                System.out.println(WELCOME_MESSAGE);
                break;
            case GAME_MODE_MESSAGE:
                System.out.println(GAME_MODE_MESSAGE);
                break;
            case ERROR_SETTING_GAME_MODE_MESSAGE:
                System.out.println(ERROR_SETTING_GAME_MODE_MESSAGE);
                break;
            case COMPUTER_MOVED_MESSAGE:
                System.out.println(COMPUTER_MOVED_MESSAGE);
                break;
            case CHOOSE_FIELD_SIZE_MESSAGE:
                System.out.println(CHOOSE_FIELD_SIZE_MESSAGE);
                break;
            case ERROR_SETTING_FIELD_SIZE_MESSAGE:
                System.out.println(ERROR_SETTING_FIELD_SIZE_MESSAGE);
                break;
            case CELL_OCCUPIED_MESSAGE:
                System.out.println(CELL_OCCUPIED_MESSAGE);
                break;
        }
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
    
    public void printExceptionMessage(String exceptionMessage) {
        System.out.println(exceptionMessage);
    }

}
