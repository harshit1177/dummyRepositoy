package com.harshit.Matrix;

public class TransposeMatrix {

   public  int[][] performTranspose(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length ; i++) {

            //**** make sure j is always less than i.
            for (int j = 0; j <= i ; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}
