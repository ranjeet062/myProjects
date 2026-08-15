package org.example;

public class WordCheck {

    public static void main(String[] args) {
        String word = "geek";
        Character[][] mat = {{'t', 'e', 'e'},{'s', 'g', 'k'},{'t', 'e', 'l'}};

        Character[][] mat1 = {{'T', 'E', 'U'},{'S', 'G', 'K'}, {'T', 'E', 'L'}};
        String word1 = "GEEK";

        System.out.print("Is word present: ");
        System.out.print(isExist(mat, word));
        System.out.println("");
        System.out.print("Is word present: ");
        System.out.print(isExist(mat1, word1));
    }

    private static boolean isExist(Character[][] mat, String word) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
             if(mat[i][j] == Character.toLowerCase(word.charAt(0))) {
                 if (findMatch(mat, word, i, j, 0)) {
                     return true;
                 }
             }
         }
        }
        return false;
    }

    private static boolean findMatch(Character[][] mat, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length) {
            return false;
        }
        if (mat[i][j] != Character.toLowerCase(word.charAt(index))) {
            return false;
        }

        return findMatch(mat, word, i + 1, j, index + 1) ||
                findMatch(mat, word, i - 1, j, index + 1) ||
                findMatch(mat, word, i, j + 1, index + 1) ||
                findMatch(mat, word, i, j - 1, index + 1);
    }



}
