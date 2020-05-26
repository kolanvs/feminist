package com.kolanvs.feminist;


import java.util.ArrayList;

public class Node {

    /**
     * The {@code Node} class describes a simple node in a finite element model.
     * Contains the number and coordinates of the node.
     *
     * @author  Nikolay Boryaev
     */

    private Integer number;
    private Double x;
    private Double y;
    private Double z;

    private ArrayList<Integer> connectedElems;
    private Integer quantityConnectedElems = 0;


    private NodeList nodeList;

    Node(Integer nodeNumber, ArrayList<Double> coords) {

        this.number = nodeNumber;

        this.x = coords.get(0);
        this.y = coords.get(1);
        this.z = coords.get(2);

    }

    public ArrayList<Double> getCoords(){

        ArrayList<Double> coords = new ArrayList<>(3);

        coords.set(0,this.x);
        coords.set(1,this.y);
        coords.set(2,this.z);

        return coords;
    }



}
