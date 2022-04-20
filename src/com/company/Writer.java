package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
    public static void main(String[] args){
        try{
            File file = new File("src/com/writer.txt");

            if(!file.exists()){
                file.createNewFile();
                PrintWriter pw = new PrintWriter(file);
                pw.println("Hello world");
                pw.println("Edvard");
                pw.close();
            }

        }catch (IOException e){
            System.out.print("Error" + e);
        }
    }
}
