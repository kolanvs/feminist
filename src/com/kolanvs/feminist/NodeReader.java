package com.kolanvs.feminist;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The class {@code NodeReader} implements the {@code FEModelFileReader} interface for reading
 * the list of nodes from the file of the ANSYS program in the NODE format.
 *
 * @author  Nikolay Boryaev
 */

public class NodeReader implements FEModelFileReader{

    private File nodeFile;


    /** The constructor accepts a way to the file on an input.
     *
     * @param filePath Path to file
     */
    NodeReader(String filePath){
       this.nodeFile = new File(filePath);
    }

    /** The constructor accepts the {@code File} object on an input
     *
     * @param file File object
     */
    NodeReader(File file){
        this.nodeFile = file;
    }

    /**This method implements the method announced in the {@code FEModelFileReader} interface,
     * reads the list of nodes from the file of nodes and returns an object of {@code NodeList}
     */

    public NodeList read(){

        try{
            FileReader nodeReaderStream = new FileReader(this.nodeFile);
            BufferedReader buffReader = new BufferedReader(nodeReaderStream);
            NodeList nodeList = new NodeList();
            Boolean eofFlag = false;
            Iterator<String> iterString = buffReader.lines().iterator();

            Integer errCount = 0;

            while (iterString.hasNext()){

                String tmpString = iterString.next();

                ArrayList<Double> coords = new ArrayList<>(3);

                try {
                    Integer nodeNumber = Integer.parseUnsignedInt(tmpString.substring(0, 9).trim());
                    coords.add(Double.parseDouble(tmpString.substring(10, 28).trim())); //Get X
                    coords.add(Double.parseDouble(tmpString.substring(29, 50).trim())); //Get Y
                    coords.add(Double.parseDouble(tmpString.substring(50, tmpString.length() - 1).trim())); //Get Z

                    nodeList.putNode(nodeNumber, coords);
                }

                catch (NumberFormatException nfe){

                    errCount++;

                }
            }

            return nodeList;

        }

        catch (IOException e) {
            e.printStackTrace();
            System.out.println("File is not found" + this.nodeFile.getName() + "\n");
            return null;
        }
    }





}
