package org.algo.isvalidsudoku;

public class IsValidSudoko {
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        };
      System.out.println("isValidSudoku: " + isValidSudoku(board));
    }

    static boolean isValidSudoku(char[][] board) {
            boolean[][] row = new boolean[9][9];
            boolean[][] col = new boolean[9][9];
            boolean[][] box = new boolean[9][9];

            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    if(board[i][j] != '.') {
                      int index = board[i][j] - '1';
                      int boxIndex = (i / 3) * 3 + (j / 3);
                      if(row[i][index] || col[j][index] || box[boxIndex][index]) {
                          return false;
                      }
                        row[i][index] = col[j][index] = box[boxIndex][index]= true;

                    }
                }
            }

            return true;
    }

}
