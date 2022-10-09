package org.collections;

public class Matrix {
    int[][] matrix = new int[2][2];

    public void addElement(int one, int two, int three, int four){
        matrix[0][0] = one;
        matrix[1][0] = two;
        matrix[0][1] = three;
        matrix[1][1] = four;
    }

    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }



}
