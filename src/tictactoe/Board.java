package tictactoe;

public class Board {
   private Value[][] array = new Value[3][3];

    public Board() {
        for (int row = 0; row < array.length; row ++ ){
            for (int column = 0; column < array[row].length; column++){
                array[row][column] = Value.EMPTY;
            }
        }

    }

    public Value[][] getArray() {
        return array;
    }
    public void displayBoard(){
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}
