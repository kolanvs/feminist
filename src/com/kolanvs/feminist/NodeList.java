package com.kolanvs.feminist;

import java.util.*;

public class NodeList {

    private Map<Integer, ArrayList<Double>> nodeListMap;
    private Integer size;


    NodeList(ArrayList<Integer> numberArray, ArrayList<ArrayList<Double>> coordsArray){

        this.size = numberArray.size();

        try {
            for (int i = 0; i < this.size; i++)
                this.nodeListMap.put(numberArray.get(i), coordsArray.get(i));
        }
        catch (NullPointerException e) {
            System.out.println("Error! Null pointer");
        }


    }


    ArrayList<Double> getCoords(Integer nodeNumber){

        return nodeListMap.get(nodeNumber);

    }



}
