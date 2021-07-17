package vav.codility.noidea;

public class TicTacToe {
    private int[] row;
    private int[] col;
    private int diagonal;
    private int antiDiagonal;
    private int n;
    public TicTacToe(int n) {
        row = new int[n];
        col = new int[n];
        this.n = n;
    }

    public int move(int row, int col, int player) {
        int add = player == 1? 1: -1;

        this.row[row] += add;
        this.col[col] += add;

        if (row == col) {
            diagonal +=add;
        }
        if (row + col == n -1) {
            antiDiagonal +=add;
        }
        if (Math.abs(this.row[row]) == n
            || Math.abs(this.col[col]) == n
            || Math.abs(diagonal) == n
            || Math.abs(antiDiagonal) == n) {
            return player;
        }
        return 0;
    }
}
