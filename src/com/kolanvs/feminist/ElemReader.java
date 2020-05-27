package com.kolanvs.feminist;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ElemReader implements FEModelFileReader{

    private File elemFile;

    ElemReader(String filePath){
        this.elemFile = new File(filePath);
    }

    ElemReader(File file){
        this.elemFile = file;
    }

    public ElemList read(){


    }

}
