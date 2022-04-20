package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;


public class Reader {
    public static void main(String[] args){
        BufferedReader file = null;
        int totalLetters = 0;
        int LineLetters;
        try{
            file = new BufferedReader(new FileReader("src/com/writer.txt"));
            String line;

            while ((line = file.readLine()) != null){
                String[] line2 = line.split(" ");
                LineLetters = 0;
                for (int i = 0; i < line.length(); i++){
                    if (line.charAt(i) != ' ') {
                        LineLetters++;
                        totalLetters++;
                    }

                }
                for (int i = 0; i < line2.length; i++){
//                    char c = line2[i].charAt(0);
//                    char c2 = Character.toUpperCase(c);
//                    System.out.println(c2);
                    line2[i] = Character.toUpperCase(line2[i].charAt(0)) + line2[i].substring(1);
                }
                System.out.print(LineLetters + " - ");
                System.out.println(Arrays.toString(line2));


                //System.out.println(line.toUpperCase());
                //(line.toLowerCase());
                //Сделать каждое слово в каждой строчке песни заглавной

            }
            System.out.print("Total letters: " + totalLetters);
            file.close();

        }catch (Exception e){
            System.out.print(e);
        }
    }
}
