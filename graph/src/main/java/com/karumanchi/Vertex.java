package com.karumanchi;

/**
 * @author Dhiraj
 * @date 05/06/19
 */
public class Vertex {
    public char label;
    public boolean visited;

    public Vertex(char label) {
        this.label = label;
        this.visited=false;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "label=" + label +
                ", visited=" + visited +
                '}';
    }
}
