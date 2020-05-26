package com.kolanvs.feminist;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NodeReader {

    private File nodeFile;


    NodeReader(String filePath){

       this.nodeFile = new File(filePath);

    }


    NodeReader(File file){

        this.nodeFile = file;

    }


    public NodeList readNodes(){

        try{
            FileReader nodeReaderStream = new FileReader(this.nodeFile);
        }

        catch (IOException e) {
            e.printStackTrace();
            System.out.println("File is not found" + this.nodeFile.getName() + "\n");
        }





    }





}
