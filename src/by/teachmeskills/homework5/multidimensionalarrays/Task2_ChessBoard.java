package by.teachmeskills.homework5.multidimensionalarrays;

public class Task2_ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if (i % 2 == 0) {
                    chessBoard[i][j] = j % 2 == 0 ? "W" : "B";
                } else {
                    chessBoard[i][j] = j % 2 == 0 ? "B" : "W";
                }
            }
        }

        for (String[] strings : chessBoard) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if (j != chessBoard.length - 1) {
                    System.out.print(strings[j] + " ");
                } else {
                    System.out.print(strings[j]);
                }
            }
            System.out.println();
        }
    }
}
