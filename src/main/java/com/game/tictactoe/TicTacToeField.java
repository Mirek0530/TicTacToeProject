package com.game.tictactoe;

public class TicTacToeField {
    private char field1_1;
    private char field1_2;
    private char field1_3;
    private char field2_1;
    private char field2_2;
    private char field2_3;
    private char field3_1;
    private char field3_2;
    private char field3_3;

    public TicTacToeField() {
        field1_1 = ' ';
        field1_2 = ' ';
        field1_3 = ' ';
        field2_1 = ' ';
        field2_2 = ' ';
        field2_3 = ' ';
        field3_1 = ' ';
        field3_2 = ' ';
        field3_3 = ' ';
    }

    public void printField() {
        System.out.println("|" + field1_1 + "|" + field1_2 + "|" + field1_3 + "|");
        System.out.println("|" + field2_1 + "|" + field2_2 + "|" + field2_3 + "|");
        System.out.println("|" + field3_1 + "|" + field3_2 + "|" + field3_3 + "|");
    }

    public void setField1_1(char field1_1) {
        this.field1_1 = field1_1;
    }

    public void setField1_2(char field1_2) {
        this.field1_2 = field1_2;
    }

    public void setField1_3(char field1_3) {
        this.field1_3 = field1_3;
    }

    public void setField2_1(char field2_1) {
        this.field2_1 = field2_1;
    }

    public void setField2_2(char field2_2) {
        this.field2_2 = field2_2;
    }

    public void setField2_3(char field2_3) {
        this.field2_3 = field2_3;
    }

    public void setField3_1(char field3_1) {
        this.field3_1 = field3_1;
    }

    public void setField3_2(char field3_2) {
        this.field3_2 = field3_2;
    }

    public void setField3_3(char field3_3) {
        this.field3_3 = field3_3;
    }
}
