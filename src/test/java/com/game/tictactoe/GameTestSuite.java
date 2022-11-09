package com.game.tictactoe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class GameTestSuite {

    @Nested
    @DisplayName("Test class for O win")
    class TestOWinClass{
        @Test
        void testOWinInFirstRow () {
            //Given
            Database database = new Database();
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(1, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(2, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(3, OSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(OSignNumber, database.checkWinLose());

        }

        @Test
        void testOWinInSecondRow () {
            //Given
            Database database = new Database();
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(4, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(6, OSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(OSignNumber, database.checkWinLose());

        }

        @Test
        void testOWinInThirdRow () {
            //Given
            Database database = new Database();
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(7, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(8, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(9, OSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(OSignNumber, database.checkWinLose());

        }

        @Test
        void testOWinInFirstColumn () {
            //Given
            Database database = new Database();
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(1, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(4, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(7, OSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(OSignNumber, database.checkWinLose());

        }

        @Test
        void testOWinInSecondColumn () {
            //Given
            Database database = new Database();
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(2, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(8, OSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(OSignNumber, database.checkWinLose());
        }


        @Test
        void testOWinInThirdColumn () {
            //Given
            Database database = new Database();
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(3, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(6, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(9, OSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(OSignNumber, database.checkWinLose());
        }

        @Test
        void testOWinInTopLeftToBottomRightDiagonal () {
            //Given
            Database database = new Database();
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(1, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(9, OSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(OSignNumber, database.checkWinLose());
        }


        @Test
        void testOWinInBottomLeftToTopRightDiagonal () {
            //Given
            Database database = new Database();
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(7, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(3, OSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(OSignNumber, database.checkWinLose());
        }
    }

    @Nested
    @DisplayName("Test class for X win")
    class TestXWinClass{
        @Test
        void testXWinInFirstRow () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;

            //When
            database.getNextMoveAndCheckIfPossible(1, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(2, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(3, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(XSignNumber, database.checkWinLose());

        }


        @Test
        void testXWinInSecondRow () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;

            //When
            database.getNextMoveAndCheckIfPossible(2, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(8, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(XSignNumber, database.checkWinLose());

        }


        @Test
        void testXWinInThirdRow () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;

            //When
            database.getNextMoveAndCheckIfPossible(3, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(6, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(9, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(XSignNumber, database.checkWinLose());

        }

        @Test
        void testXWinInFirstColumn () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;

            //When
            database.getNextMoveAndCheckIfPossible(1, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(4, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(7, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(XSignNumber, database.checkWinLose());

        }

        @Test
        void testXWinInSecondColumn () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;

            //When
            database.getNextMoveAndCheckIfPossible(2, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(8, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(XSignNumber, database.checkWinLose());

        }

        @Test
        void testXWinInThirdColumn () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;

            //When
            database.getNextMoveAndCheckIfPossible(3, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(6, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(9, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(XSignNumber, database.checkWinLose());

        }


        @Test
        void testXWinInTopLeftToBottomRightDiagonal () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;

            //When
            database.getNextMoveAndCheckIfPossible(1, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(9, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(XSignNumber, database.checkWinLose());

        }

        @Test
        void testXWinInBottomLeftToTopRightDiagonal () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;

            //When
            database.getNextMoveAndCheckIfPossible(7, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(3, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(XSignNumber, database.checkWinLose());

        }
    }

    @Nested
    @DisplayName("Test class for draw cases")
    class TestDrawCases {

        @Test
        void testDrawFirstCase () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(1, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(2, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(3, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(4, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(6, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(7, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(8, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(9, OSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(0, database.checkWinLose());

        }

        @Test
        void testDrawSecondCase () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(1, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(2, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(3, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(4, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(6, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(7, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(8, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(9, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(0, database.checkWinLose());

        }

        @Test
        void testDrawThirdCase () {
            //Given
            Database database = new Database();
            int XSignNumber = 1;
            int OSignNumber = 2;

            //When
            database.getNextMoveAndCheckIfPossible(1, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(2, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(3, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(4, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(5, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(6, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(7, OSignNumber, false);
            database.getNextMoveAndCheckIfPossible(8, XSignNumber, false);
            database.getNextMoveAndCheckIfPossible(9, XSignNumber, false);

            //Then
            assertTrue(database.isGameOver());
            assertEquals(0, database.checkWinLose());

        }
    }

    @Test
    void testExceptionIfWrongParameterEntered() {
        //Given

        //When

        //Then

    }
}
