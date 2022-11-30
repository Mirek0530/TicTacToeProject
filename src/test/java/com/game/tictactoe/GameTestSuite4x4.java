package com.game.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTestSuite4x4 {
    private static final int X_SIGN_NUMBER = 1;
    private static final int O_SIGN_NUMBER = 2;
    private Database database;

    @BeforeEach
    public void beforeEach() {
        database = new Database();
        int fieldSize = 16;
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
                database.getNextMoveAndCheckIfPossible(2, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(3, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(4, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(5, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(6, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(7, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(10, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(11, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(12, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(1, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(5, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(9, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(6, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(10, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(14, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(7, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(11, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(15, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(5, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(10, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(15, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(14, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(11, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(8, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(1, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(2, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(3, X_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(5, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(6, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(7, X_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(10, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(11, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(12, X_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(1, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(5, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(9, X_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(2, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(6, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(10, X_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(3, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(7, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(11, X_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(1, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(6, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(11, X_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testXWinInBottomLeftToTopRightDiagonal () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(9, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(6, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(3, X_SIGN_NUMBER);
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
            int firstTry = 17;
            int secondTry = -2;
            int thirdTry = 145;

            //Then
            assertAll(
                    () -> assertThrows(IncorrectCellNumberException.class, () -> database.getNextMoveAndCheckIfPossible(firstTry, X_SIGN_NUMBER)),
                    () -> assertThrows(IncorrectCellNumberException.class, () -> database.getNextMoveAndCheckIfPossible(secondTry, X_SIGN_NUMBER)),
                    () -> assertThrows(IncorrectCellNumberException.class, () -> database.getNextMoveAndCheckIfPossible(thirdTry, X_SIGN_NUMBER))
            );
        }

        @Test
        void testIfMethodDoesNotThrowIncorrectCellNumberException() {
            //Given

            //When
            int firstTry = 2;
            int secondTry = 10;
            int thirdTry = 16;

            //Then
            assertAll(
                    () -> assertDoesNotThrow(() -> database.getNextMoveAndCheckIfPossible(firstTry, X_SIGN_NUMBER)),
                    () -> assertDoesNotThrow(() -> database.getNextMoveAndCheckIfPossible(secondTry, X_SIGN_NUMBER)),
                    () -> assertDoesNotThrow(() -> database.getNextMoveAndCheckIfPossible(thirdTry, X_SIGN_NUMBER))
            );
        }
    }
}