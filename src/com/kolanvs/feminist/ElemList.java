package com.kolanvs.feminist;

import java.util.ArrayList;
import java.util.TreeMap;

public class ElemList extends FEModelList {

    private TreeMap<Integer, Elem> elemListMap;
    private Integer size;
    private Integer readErrors;

    ElemList(){
        this.size = 0;
        this.readErrors = 0;
        this.elemListMap = new TreeMap<>();
    }

    public void putElem(Integer elemNumber, ArrayList<Integer> vertices, Integer elemType){
        this.elemListMap.put(elemNumber, new Elem(elemNumber, vertices, elemType));
    }

    public Elem getElem(Integer elemNumber){
        return  this.elemListMap.get(elemNumber);
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
