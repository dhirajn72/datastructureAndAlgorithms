package com.karumanchi;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 04/06/19
 */
public class MatrixRepresentation {
    private boolean adjMatrix[][];
    private int vertexCount;

    public MatrixRepresentation(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new boolean[vertexCount][vertexCount];
    }

    public static void main(String[] args) {
        MatrixRepresentation matrix = new MatrixRepresentation(5);
        matrix.addEdge(0, 1);
        matrix.addEdge(1, 2);
        matrix.addEdge(2, 3);
        matrix.addEdge(3, 4);
        matrix.addEdge(4, 0);
        matrix.addEdge(0, 2);
        System.out.println(Arrays.deepToString(matrix.adjMatrix));
    }

    public void addEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
    }

    public void removeEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }
    }

    public boolean isEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount)
            return adjMatrix[i][j];
        return false;
    }

}
