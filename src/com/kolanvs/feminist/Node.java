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

    private NodeList nodeList;

    Node(Integer nodeNumber, NodeList nodeList) {

        this.number = nodeNumber;
        this.nodeList = nodeList;


        ArrayList<Double> coords = this.nodeList.getCoords(this.number);

        this.x = coords.get(0);
        this.y = coords.get(1);
        this.z = coords.get(2);


    }

}
