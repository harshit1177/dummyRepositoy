package com.harshit.Matrix;

import java.util.Arrays;

public class ClockWiseRotation {

    TransposeMatrix transposeMatrix = new TransposeMatrix();

    public int[][] performClockWiseRotation(int[][] twoDMatrix){
       twoDMatrix =  transposeMatrix.performTranspose(twoDMatrix);
       for (int i = 0; i<twoDMatrix.length;i++){
           ClockWiseRotation.giveReverseArray(twoDMatrix[i]);
       }
       return twoDMatrix;
    }

    public static int[] giveReverseArray(int[] array){

        int frontPointer=0;
        int backPointer= array.length-1;
        int temp ;
        while(backPointer > frontPointer){
            temp = array[backPointer];
            array[backPointer] = array[frontPointer];
            array[frontPointer] = temp;
            backPointer--;
            frontPointer++;
            //System.out.println(array[frontPointer-1]+" "+array[backPointer+1]);
        }
        return array;
    }

}
