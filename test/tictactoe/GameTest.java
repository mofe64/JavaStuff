package tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void testThatPlayerCanMakeAMove() throws MoveOutOfBoundsException, GameOverException, BoardFullException, AlreadyOccupiedException {
        game.makeMove(9);
        Value[][] array = game.getBoard();
        assertEquals(Value.X, array[2][2]);
    }

    @Test
    void testThatXCannotBePlayedTwice() throws MoveOutOfBoundsException, GameOverException, BoardFullException, AlreadyOccupiedException {
        game.makeMove(9);
        Value[][] array = game.getBoard();
        assertEquals(Value.X, array[2][2]);
        game.makeMove(8);
        assertNotEquals(Value.X, array[2][1]);
        assertEquals(Value.O, array[2][1]);
    }

    @Test
    void testThatPlayerCantMakeMovesOutOfBound(){
        assertThrows(MoveOutOfBoundsException.class, ()-> {
            game.makeMove(10);
        });
    }

    @Test
    void testThatWinnerCanBeDetermined() throws MoveOutOfBoundsException, BoardFullException, AlreadyOccupiedException {

        try {
            game.makeMove(1); //x
            game.makeMove(4); //0
            game.makeMove(2); //x
            game.makeMove(5); //0
            game.makeMove(3); //x
            game.isGameWon();
            assertTrue(game.isWon());
        } catch (GameOverException ignored) {
        }



    }
}