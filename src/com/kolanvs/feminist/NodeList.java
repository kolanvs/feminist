package com.kolanvs.feminist;

import java.util.*;

public class NodeList extends FEModelList {

    private TreeMap<Integer, Node> nodeListMap;
    private Integer size;
    private Integer readErrors;


    NodeList(){
        this.size = 0;
        this.readErrors = 0;
        this.nodeListMap = new TreeMap<>();
    }

    public void putNode(Integer nodeNumber, ArrayList<Double> coords){

        this.nodeListMap.put(nodeNumber, new Node(nodeNumber, coords));
    }

    public Node getNode(Integer nodeNumber){
        return this.nodeListMap.get(nodeNumber);
    }

    public ArrayList<Double> getCoords(Integer nodeNumber){
        return this.getNode(nodeNumber).getCoords();
    }

    public Integer getSize() {
        return size;
    }

    public Integer getReadErrors() {
        return readErrors;
    }

    public void sizeIncrease(){
        this.size++;
    }

    public void increaseReadErrors(){
        this.readErrors++;
    }



}
