package com.example.part3FileReader;

/*
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Lấy file từ classpath
        try (InputStream is = Main.class.getResourceAsStream("/input.txt");
             InputStreamReader reader = new InputStreamReader(is)) {

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        }
    }
}
*/

import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    String path = "./input.txt";
    FileReader reader = new FileReader(path);
    int data = 0;
    while ((data = reader.read()) != -1) {    
      System.out.print((char)data);    
    } 
    reader.close();
  }
}