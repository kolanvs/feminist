package com.kolanvs.feminist;

import java.util.ArrayList;

public class Elem {

    private Integer elemNumber;
    private ArrayList<Integer> vertices;
    private Integer elemType;

    Elem(Integer elemNumber, ArrayList<Integer> vertices, Integer elemType){

        this.elemNumber = elemNumber;
        this.vertices = vertices;
        this.elemType = elemType;
    }

    public Integer getElemNumber() {
        return elemNumber;
    }

    public ArrayList<Integer> getVertices() {
        return vertices;
    }

    public Integer getElemType() {
        return elemType;
    }


}

