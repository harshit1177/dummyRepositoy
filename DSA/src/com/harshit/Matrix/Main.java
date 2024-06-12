package com.harshit.Matrix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] twoDMatrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},
                {21,22,23,24,25}};
        int[][] twoDMatrix2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},
                {21,22,23,24,25}};

        int sizeArray = (twoDMatrix.length)*(twoDMatrix.length);
        System.out.println(sizeArray);
        int[] newArray= new int[sizeArray];
        System.out.println("Original matrxi");
        System.out.println(Arrays.deepToString(twoDMatrix));
        RotateAnticlockWise rotateAnticlockWise = new RotateAnticlockWise();
     //   twoDMatrix = rotateAnticlockWise.rotateAnticlockWise(twoDMatrix);
        System.out.println("Matrix after anticlock wise rotation");
        System.out.println(Arrays.deepToString(twoDMatrix));

        ClockWiseRotation clockWiseRotation = new ClockWiseRotation();
        twoDMatrix2= clockWiseRotation.performClockWiseRotation(twoDMatrix2);
        System.out.println("Matrix after clock wise rotation");
        System.out.println(Arrays.deepToString(twoDMatrix2));
        int k = 0;
        for(int i=0;i<twoDMatrix.length;i++){
            for(int j=0;j<twoDMatrix.length;j++){
                newArray[k]=twoDMatrix[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArray));


    }
}
