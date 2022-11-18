package com.game.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTestSuite10x10 {
    private static final int X_SIGN_NUMBER = 1;
    private static final int O_SIGN_NUMBER = 2;
    private Database database;

    @BeforeEach
    public void beforeEach() {
        database = new Database();
        int fieldSize = 100;
        database.setFieldSize(fieldSize);
        database.initializeCellsMap(fieldSize);
    }

    @Nested
    @DisplayName("Test class for O win")
    class TestOWinClass{
        @Test
        void testOWinInFirstRow () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(1, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(2, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(3, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(4, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(5, O_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testOWinInSecondRow () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(11, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(12, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(13, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(14, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(15, O_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testOWinInThirdRow () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(25, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(26, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(27, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(28, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(29, O_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testOWinInFirstColumn () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(1, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(11, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(21, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(31, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(41, O_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testOWinInSecondColumn () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(42, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(52, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(62, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(72, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(82, O_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());
        }


        @Test
        void testOWinInThirdColumn () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(33, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(43, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(53, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(63, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(73, O_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());
        }

        @Test
        void testOWinInTopToBottomDiagonal () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(24, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(35, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(46, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(57, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(68, O_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());
        }


        @Test
        void testOWinInBottomToTopDiagonal () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(75, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(66, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(57, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(48, O_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(39, O_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());
        }
    }

    @Nested
    @DisplayName("Test class for X win")
    class TestXWinClass{
        @Test
        void testXWinInFirstRow () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(5, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(6, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(7, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(8, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(9, X_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }


        @Test
        void testXWinInSecondRow () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(14, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(15, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(16, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(17, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(18, X_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }


        @Test
        void testXWinInThirdRow () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(21, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(22, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(23, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(24, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(25, X_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testXWinInFirstColumn () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(21, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(31, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(41, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(51, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(61, X_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testXWinInSecondColumn () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(42, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(52, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(62, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(72, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(82, X_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testXWinInThirdColumn () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(13, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(23, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(33, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(43, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(53, X_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }


        @Test
        void testXWinInTopToBottomDiagonal () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(11, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(22, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(33, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(44, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(55, X_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testXWinInBottomToTopDiagonal () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(81, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(72, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(63, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(54, X_SIGN_NUMBER, false);
                database.getNextMoveAndCheckIfPossible(45, X_SIGN_NUMBER, false);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }
    }

    @Nested
    @DisplayName("Test class for exceptions")
    class TestExceptionsClass{
        @Test
        void testIfMethodThrowsIncorrectCellNumberException() {
            //Given

            //When
            int firstTry = 120;
            int secondTry = -8;
            int thirdTry = 421;

            //Then
            assertAll(
                    () -> assertThrows(IncorrectCellNumberException.class, () -> database.getNextMoveAndCheckIfPossible(firstTry, X_SIGN_NUMBER, false)),
                    () -> assertThrows(IncorrectCellNumberException.class, () -> database.getNextMoveAndCheckIfPossible(secondTry, X_SIGN_NUMBER, false)),
                    () -> assertThrows(IncorrectCellNumberException.class, () -> database.getNextMoveAndCheckIfPossible(thirdTry, X_SIGN_NUMBER, false))
            );
        }

        @Test
        void testIfMethodDoesNotThrowIncorrectCellNumberException() {
            //Given

            //When
            int firstTry = 2;
            int secondTry = 43;
            int thirdTry = 99;

            //Then
            assertAll(
                    () -> assertDoesNotThrow(() -> database.getNextMoveAndCheckIfPossible(firstTry, X_SIGN_NUMBER, false)),
                    () -> assertDoesNotThrow(() -> database.getNextMoveAndCheckIfPossible(secondTry, X_SIGN_NUMBER, false)),
                    () -> assertDoesNotThrow(() -> database.getNextMoveAndCheckIfPossible(thirdTry, X_SIGN_NUMBER, false))
            );
        }
    }
}