package com.apolis.corejava.exception;

import java.io.*;

public class DataReader {
    public static void main(String[] args) {

        File file= new File("C:\\Users\\Sam\\Download\\Horus Heresy.pdf");

        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
            while (true){
                try {
                    if (!(bufferedReader.readLine()!=null)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    System.out.println(bufferedReader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
