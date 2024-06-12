package com.harshit.Matrix;

import java.util.Arrays;

public class RotateAnticlockWise {

    TransposeMatrix transposeMatrix = new TransposeMatrix();
    
    public int[][] rotateAnticlockWise(int [][]twoDMatrix){
 
        twoDMatrix = transposeMatrix.performTranspose(twoDMatrix);
        twoDMatrix = RotateAnticlockWise.reverseRows(twoDMatrix);
        return twoDMatrix;
    }
    
    public static int[][] reverseRows(int [][] twoDMatrix){
        int size = twoDMatrix.length-1;
        int temp;
        for(int j=0;j < twoDMatrix.length;j++){
            for(int i = 0; i<twoDMatrix.length/2;i++){
                temp = twoDMatrix[i][j];
                twoDMatrix[i][j] = twoDMatrix[size-i][j];
                twoDMatrix[size-i][j] = temp;
            }
        }
        return twoDMatrix;
    }

}
