package Array;

import java.util.HashMap;

/**
 * 有序的数独
 * @author grady
 * @date 20-5-22 下午2:13
 */
public class IsValidSudoku {

    public static void main(String[] args) {


    }
    private static boolean solution(char[][] board){
            HashMap<Integer,Integer>[] rows = new HashMap[9];
            HashMap<Integer,Integer>[] columns = new HashMap[9];
            HashMap<Integer,Integer>[] boxes = new HashMap[9];

            for (int i = 0; i < 9; i++) {
                rows[i] = new HashMap<Integer, Integer>();
                columns[i] = new HashMap<Integer, Integer>();
                boxes[i] = new HashMap<Integer, Integer>();
            }

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char num = board[i][j];
                    if (num!='.'){
                        int n = (int) num;
                        int box_index = (i/3)*3+j/3;
                        rows[i].put(n,rows[i].getOrDefault(n,0)+1);
                        columns[i].put(n,columns[i].getOrDefault(n,0)+1);
                        boxes[box_index].put(n,boxes[box_index].getOrDefault(n,0));

                        if (rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[box_index].get(n) > 1){
                            return false;
                        }
                    }
                }
            }
            return true;
    }
}
