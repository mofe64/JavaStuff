package tictactoe;

public enum Value {
    X,
    O,
    EMPTY;

    @Override
    public String toString() {
       String value = "";
       switch (this) {
           case O -> value = "O";
           case X -> value = "X";
           case EMPTY -> value = " ";
       }
       return value;
    }
}
