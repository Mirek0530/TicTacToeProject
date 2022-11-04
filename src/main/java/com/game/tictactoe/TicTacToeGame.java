package com.game.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    private TicTacToeData data;
    private TicTacToeMessager messager;
    private Scanner input;
    boolean gameModePlayerVsPlayer;
    boolean gameModeSelected = false;
    boolean end = false;
    boolean movePlayed = false;

    public TicTacToeGame() {
        data = new TicTacToeData();
        messager = new TicTacToeMessager();
        input = new Scanner(System.in);
    }

    public void run() {
        messager.welcomeMessage();

        messager.chooseGameModeMessage();
        setGameMode(input);

        messager.howToPlay();
        data.showStatus();

        while (!end) {
            movePlayed = false;
            messager.requestNextMove(1);
            getNextMove(input, 1);
            data.showStatus();
            end = data.isGameOver();

            if (end) {
                break;
            } else {
                movePlayed = false;
            }

            if (!gameModePlayerVsPlayer) {
                computerMove(2);
            } else {
                messager.requestNextMove(2);
                getNextMove(input, 2);
            }

            data.showStatus();
            end = data.isGameOver();
        }

        data.getResult();
    }

    public void getNextMove(Scanner input, int signNumber) {
        String inputEntry = "";
        int i;

        while (!movePlayed) {
            while (true) {
                inputEntry = input.next();
                try {
                    i = Integer.parseInt(inputEntry);
                    break;
                } catch (NumberFormatException nfe) {
                    messager.illegalArgument(nfe);
                }
            }

            if (i >= 1 && i <=9) {
                movePlayed = data.getNextMoveAndCheckIfPossible(i, signNumber, false);
            } else {
                messager.wrongNumber();
            }
        }
    }

    private void computerMove(int signNumber) {
        Random random = new Random();
        while (!movePlayed) {
            int generatedCellNumber = random.nextInt(9) + 1;
            movePlayed = data.getNextMoveAndCheckIfPossible(generatedCellNumber, signNumber, true);
        }
        messager.computerPlayed();
    }

    private void setGameMode(Scanner input) {
        String inputEntry = "";
        int gameModeSelection;

        while (!gameModeSelected) {
            while (true) {
                inputEntry = input.next();
                try {
                    gameModeSelection = Integer.parseInt(inputEntry);
                    break;
                } catch (NumberFormatException nfe) {
                    messager.errorSettingGameMode();
                }
            }

            switch (gameModeSelection) {
                 case 1:
                     gameModePlayerVsPlayer = true;
                     gameModeSelected = true;
                     break;
                 case 2:
                     gameModePlayerVsPlayer = false;
                     gameModeSelected = true;
                     break;
                 default:
                     gameModeSelected = false;
                     messager.errorSettingGameMode();
            }
        }
    }
}
