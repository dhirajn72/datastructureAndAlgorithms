package session3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 29/11/19
 */
public class ValidateSudoku {
    public static void main(String[] args) {
        char[][] chars = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
                /*new char[][]{
                        {'.','.','.','.','5','.','.','1','.'},
                        {'.','4','.','3','.','.','.','.','.'},
                        {'.','.','.','.','.','3','.','.','1'},
                        {'8','.','.','.','.','.','.','2','.'},
                        {'.','.','2','.','7','.','.','.','.'},
                        {'.','1','5','.','.','.','.','.','.'},
                        {'.','.','.','.','.','2','.','.','.'},
                        {'.','2','.','9','.','.','.','.','.'},
                        {'.','.','4','.','.','.','.','.','.'}};*/



        System.out.println(isValidSudoku(chars));
    }
    public static boolean isValidSudoku(char[][] board) {
        if (board == null) return false;
        if (board.length != board[0].length) return false;
        List<Character> integers = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!integers.contains(board[i][j])) {
                    integers.add(board[i][j]);
                }
                else if ('.'==board[i][j]){
                    continue;
                }
                else {
                    return false;
                }
            }
            integers.clear();
            for (int j = 0; j < 9; j++) {
                if (!integers.contains(board[j][i]) ) {
                    integers.add(board[j][i]);
                }
                else if ('.'==board[j][i]){
                    continue;
                }
                else {
                    return false;
                }
            }
            integers.clear();

        }

        List<Character> l1=new ArrayList<>();
        List<Character> l2=new ArrayList<>();
        List<Character> l3=new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j<3){
                    if (!l1.contains(board[i][j]) ) {
                        l1.add(board[i][j]);
                    }
                    else if ('.'==board[i][j]){
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else if (j<6){
                    if (!l2.contains(board[i][j]) ) {
                        l2.add(board[i][j]);
                    }
                    else if ('.'==board[i][j]){
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else if (j<9){
                    if (!l3.contains(board[i][j]) ) {
                        l3.add(board[i][j]);
                    }
                    else if ('.'==board[i][j]){
                        continue;
                    }
                    else {
                        return false;
                    }
                }
            }
            if (i==2 || i==5){
                l1.clear();
                l2.clear();
                l3.clear();
            }
        }
        return true;
    }
}
