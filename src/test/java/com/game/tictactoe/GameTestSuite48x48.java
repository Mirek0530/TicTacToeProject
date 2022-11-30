package com.game.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Just to check if my program works for EVERY field size. :)")
public class GameTestSuite48x48 {
    private static final int X_SIGN_NUMBER = 1;
    private static final int O_SIGN_NUMBER = 2;
    private Database database;

    @BeforeEach
    public void beforeEach() {
        database = new Database();
        int fieldSize = 2304;
        database.setFieldSize(fieldSize);
        database.initializeCellsMap(fieldSize);
    }

    @Nested
    @DisplayName("Test class for O win")
    class TestOWinClass{
        @Test
        void testOWinInRowFirstCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(29, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(30, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(31, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(32, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(33, O_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testOWinInRowSecondCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(63, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(64, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(65, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(66, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(67, O_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testOWinInRowThirdCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(101, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(102, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(103, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(104, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(105, O_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testOWinInColumnFirstCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(24, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(72, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(120, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(168, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(216, O_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testOWinInColumnSecondCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(42, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(90, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(138, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(186, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(234, O_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(O_SIGN_NUMBER, database.checkWinLose());
        }

        @Test
        void testOWinInColumnThirdCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(58, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(106, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(154, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(202, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(250, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(249, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(298, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(347, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(396, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(445, O_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(971, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(924, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(877, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(830, O_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(783, O_SIGN_NUMBER);
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
        void testXWinInRowFirstCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(29, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(30, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(31, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(32, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(33, X_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }


        @Test
        void testXWinInRowSecondCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(156, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(157, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(158, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(159, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(160, X_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }


        @Test
        void testXWinInRowThirdCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(1001, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(1002, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(1003, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(1004, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(1005, X_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testXWinInColumnFirstCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(24, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(72, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(120, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(168, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(216, X_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testXWinInColumnSecondCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(42, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(90, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(138, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(186, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(234, X_SIGN_NUMBER);
            } catch (IncorrectCellNumberException e) {
                System.out.println(e.getMessage());
            }

            //Then
            assertTrue(database.isGameOver());
            assertEquals(X_SIGN_NUMBER, database.checkWinLose());

        }

        @Test
        void testXWinInColumnThirdCase () {
            //Given

            //When
            try {
                database.getNextMoveAndCheckIfPossible(58, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(106, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(154, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(202, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(250, X_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(249, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(298, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(347, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(396, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(445, X_SIGN_NUMBER);
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
                database.getNextMoveAndCheckIfPossible(971, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(924, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(877, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(830, X_SIGN_NUMBER);
                database.getNextMoveAndCheckIfPossible(783, X_SIGN_NUMBER);
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
            int firstTry = 2306;
            int secondTry = -1;
            int thirdTry = 4200;

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
            int firstTry = 48;
            int secondTry = 1207;
            int thirdTry = 2002;

            //Then
            assertAll(
                    () -> assertDoesNotThrow(() -> database.getNextMoveAndCheckIfPossible(firstTry, X_SIGN_NUMBER)),
                    () -> assertDoesNotThrow(() -> database.getNextMoveAndCheckIfPossible(secondTry, X_SIGN_NUMBER)),
                    () -> assertDoesNotThrow(() -> database.getNextMoveAndCheckIfPossible(thirdTry, X_SIGN_NUMBER))
            );
        }
    }
}