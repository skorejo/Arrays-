package com.cracking.the.coding.interview.practice.array.and.string;

public class ZeroMatrix {
    public static void main(String abc[]) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {1, 0, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 0, 4}
            };

        ZeroMatrix z = new ZeroMatrix();
        int[][] output = z.checkAndUpdateMatrix(arr, 4,4);
        for(int i=0; i <output.length; i++ ) {
            for(int j=0; j <output.length; j++ ) {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }

    }

    int[][] checkAndUpdateMatrix(int[][] arr, int rows, int columns) {
        int[][] output = new int[4][4];

        for(int i = 0; i < rows; i ++) {
            for (int j = 0; j < columns; j++) {

                output[i][j] = arr[i][j];
            }
        }

        for(int i = 0; i < rows; i ++) {
            for(int j = 0; j < columns ; j++) {
                   if(arr[i][j] == 0)
                    {
                    for(int k=0; k < arr.length; k ++) {
                        output[i][k] = 0;
                        output[k][j] = 0;
                    }

                }
            }
        }
        return output;
    }
}

