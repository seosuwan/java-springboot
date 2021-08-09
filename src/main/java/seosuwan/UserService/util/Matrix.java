package seosuwan.UserService.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Matrix {
    public int[][] createMatrix(int row, int column){
        int[][] matrix = new int[row][column];
        int k = 1;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column;j ++){
                matrix[i][j] = k;
                k++;
            }
        }
        return matrix;
    }
}
