package com.game.tictactoe;

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

        while (!gameModeSelected) {
            messager.chooseGameModeMessage();
            interpretGameModeInput(input.next());
        }

        messager.howToPlay();
        data.showStatus();

        while (!end) {
            movePlayed = false;
            while (!movePlayed) {
                messager.requestNextMove(1);
                interpretNextMove(input.next(), 1);
            }
            data.showStatus();
            end = data.isGameOver();

            if (end) {
                break;
            } else {
                movePlayed = false;
            }

            while (!movePlayed && gameModePlayerVsPlayer) {
                messager.requestNextMove(2);
                interpretNextMove(input.next(), 2);
            }

            data.showStatus();
            end = data.isGameOver();
        }

        data.getResult();
    }

    private void interpretNextMove(String move, int signNumber) {
        switch (move) {
            case "1":
                movePlayed = data.getNextMoveAndCheckIfPossible(1, signNumber);
                break;
            case "2":
                movePlayed = data.getNextMoveAndCheckIfPossible(2, signNumber);
                break;
            case "3":
                movePlayed = data.getNextMoveAndCheckIfPossible(3, signNumber);
                break;
            case "4":
                movePlayed = data.getNextMoveAndCheckIfPossible(4, signNumber);
                break;
            case "5":
                movePlayed = data.getNextMoveAndCheckIfPossible(5, signNumber);
                break;
            case "6":
                movePlayed = data.getNextMoveAndCheckIfPossible(6, signNumber);
                break;
            case "7":
                movePlayed = data.getNextMoveAndCheckIfPossible(7, signNumber);
                break;
            case "8":
                movePlayed = data.getNextMoveAndCheckIfPossible(8, signNumber);
                break;
            case "9":
                movePlayed = data.getNextMoveAndCheckIfPossible(9, signNumber);
                break;
            default:
                messager.errorChoosingCell();
        }
    }

    private void interpretGameModeInput(String gameModeSelection) {
        switch (gameModeSelection) {
            case "1":
                gameModePlayerVsPlayer = true;
                gameModeSelected = true;
                break;
            case "2":
                gameModePlayerVsPlayer = false;
                gameModeSelected = true;
                break;
            default:
                gameModeSelected = false;
                messager.errorSettingGameMode();
        }
    }
}
