package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        while (!gameOver) {
            try {
                game.displayBoard();
                System.out.println("Enter a position to play");
                int position = scanner.nextInt();
                game.makeMove(position);
            } catch (GameOverException  e) {
                if(game.lastValuePlayedWasX) {
                    System.out.println("X WON");
                    game.displayBoard();
                } else {
                    System.out.println("O WON");
                }
                gameOver = true;
            } catch (BoardFullException e) {
                System.out.println("Its a draw ");
                gameOver = true;
            }
            catch (AlreadyOccupiedException e) {
                System.out.println("That position is already occupied");
            }
        }
    }
}
